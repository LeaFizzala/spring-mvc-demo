<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

<title>Customer Registration Form</title>


<style type="text/css">

.error{color:red}

</style>
</head>
<body>

<p>Please fill out the form. Asterisk (*) means the field is required.</p>

<form:form action="processForm" modelAttribute="customer">


	First name : <form:input path="firstName"/>
	
	<br><br>
	
	Last name (*) : <form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error" /> <!-- Display error message if set -->
	
	<br><br>
	
	<input type="submit" value="Submit" />
	
</form:form>


</body>


</html>