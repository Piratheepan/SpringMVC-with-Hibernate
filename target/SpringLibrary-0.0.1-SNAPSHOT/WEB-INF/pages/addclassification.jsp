<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<form:form action="/SpringLibrary/registrationSuccess" method="post" modelAttribute="classification">
	
				<div class="form-group">
				<form:input path="classificationId" />
				</div>
				
				<div class="form-group">
				<form:input  path="classificationName"/>
				</div>
		<input type="submit" value="save"/>

	</form:form>
</body>
</html>