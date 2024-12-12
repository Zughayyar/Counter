<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Current visit count</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <div class="container">
        <p>You visited http://127.0.0.1:8080 
            <span class="my-count"><c:out value="${count}"></c:out></span> Times
        </p>
        <a href="/" class="button">Test another visit</a>
        <a href="/reset" class="button">Reset counter</a>
    </div>
</body>
</html>