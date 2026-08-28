<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String name = (String) session.getAttribute("name"); %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>Student Profile</h1>
	<p>Username: ${name}</p>
	<p>Status: Logged In</p>
</body>
</html>