<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>

	<h1 align="center">Love Calculator</h1>

	<hr>

	<div align="center">
		<h2>The Registration is successful</h2>
		<h2>
			The details are as follows : <br>
		</h2>
		Name : ${user.name} <br />
		Username : ${user.username} <br />
		Password : ${user.password} <br />
		Country : ${user.countryName} <br />
		Hobbies :
		<c:forEach var="temp" items="${user.hobbies}">
			${temp}
		</c:forEach>
		<br>
		Gender : ${user.gender}<br>
		Age : ${user.age}<br>
		Email : ${user.comDto.email}<br>
		Phone Number : ${user.comDto.phone}

	</div>
</body>
</html>