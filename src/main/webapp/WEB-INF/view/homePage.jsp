<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>
.errors{
	color:red;
	text-align:left;
	margin-left: 30px;
	position:fixed;
}
</style>


</head>
<body>

	<h1 align="center">Love Calculator</h1>

	<hr>

	<form:form action="process" method="get" modelAttribute="user">

		<div align="center">
			<p>
				<label>Your Name : </label>
				 <form:input path="username"/>
				 <form:errors path="username" cssClass="errors"/>

			</p>
			<p>
				<label>Crush Name : </label>
				<form:input path="crushname"/>
				 <form:errors path="crushname" cssClass="errors"/>
			</p>

			<p>
			<form:checkbox path="termsAndConditions" value="agree"/>
			<label>I agree that this is for practice fun</label>
				 <form:errors path="termsAndConditions" cssClass="errors"/>

			</p>


			<input type="submit" value="Submit">
			</div>
	</form:form>


</body>
</html>