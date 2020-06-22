<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>

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
	<h1 align="center">Register Page</h1>

	<form:form action="registerProcess" modelAttribute="user">

		<div align="center">

			<p>
				<label>User : </label>
				<form:input path="name" />
				 <form:errors path="name" cssClass="errors"/>
			</p>

			<p>
				<label>Username : </label>
				<form:input path="username" />
				<form:errors path="username" cssClass="errors"/>

			</p>

			<p>
				<label>Password : </label>
				<form:password path="password" />
				<form:errors path="password" cssClass="errors"/>
			</p>

			<p>
				<label>Country : </label>
				<form:select path="countryName">
					<form:option value="Ind" label="India"></form:option>
					<form:option value="USA" label="USA"></form:option>
					<form:option value="UK" label="UK"></form:option>
				</form:select>

			</p>

			<p>
				<label>Hobbies : </label> Yoga :
				<form:checkbox path="hobbies" value="yoga" />
				Reading :
				<form:checkbox path="hobbies" value="reading" />
				Dancing :
				<form:checkbox path="hobbies" value="dancing" />
				Music :
				<form:checkbox path="hobbies" value="music" />

			</p>

			<p>
				<label>gender : </label> Male :
				<form:radiobutton path="gender" value="male" />
				Female :
				<form:radiobutton path="gender" value="female" />
				<form:errors path="gender" cssClass="errors"/>

			</p>

			<p>
				<label>Age : </label>
				<form:input path="age" />
				<form:errors path="age" cssClass="errors"/>
			</p>

			<p>
				<label>Email : </label>
				<form:input path="comDto.email" />
			</p>

			<p>
            	<label>Phone Number : </label>
            	<form:input path="comDto.phone" />
            </p>

			<input type="submit" value="Register" />

		</div>
	</form:form>
</body>
</html>