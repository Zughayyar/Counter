package com.axsosacademy.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String index(HttpSession session) {
        if (session.getAttribute("count") == null) {
            int newCount = 1;
            session.setAttribute("count", newCount);
        } else {
            Integer currentCount = (Integer) session.getAttribute("count");
            session.setAttribute("count", currentCount + 1);
        }
        return "index.jsp";
    }

    @RequestMapping(value = "/counter", method=RequestMethod.GET)
    public String count(HttpSession session) {
        if (session.getAttribute("count") == null) {
            int newCount = 0;
            session.setAttribute("count", newCount);
        }
        return "counter.jsp";
    }

    @RequestMapping(value = "/reset", method=RequestMethod.GET)
    public String reset(HttpSession session) {
        session.setAttribute("count", 0);
        return "redirect:/counter";
    }
    
    


}
