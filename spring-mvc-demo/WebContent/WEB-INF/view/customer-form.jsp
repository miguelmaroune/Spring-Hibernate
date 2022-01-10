<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style >
	.error{color:red}
</style>
</head>
<body>
<i>Fill out the form ,(*) means required.</i>
	<form:form action="processForm" modelAttribute="customer">
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name(*): <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"></form:errors>
	
	<input type="submit" value="submit"/>
	
	
	</form:form>
</body>
</html>