<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>


<html>
<head>
<title> Student Registration Form</title>
</head>

<body>

	<h1> Register at Greendale !</h1>
	
	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName"/>
		
		<br><br>
		
		Last name <form:input path="lastName"/>
		
		<br><br>
		
		Country :
		<form:select path="country"> <!-- On submit, Spring will call the method setCountry() -->
		
			<form:options items="${student.countryOptions }"/> <!-- items refer to the collection of data // Spring will call student.getCountryOptions() -->
		
		
		</form:select>
		
		<br><br>
		
		Favorite language : 
		<br><br>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		<br><br>
		Javascript <form:radiobutton path="favoriteLanguage" value="Javascript"/>
		<br><br>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		<br><br>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		
		<br><br>
		
		Operating systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
	
	<input type="submit" value="Submit"/>
	
	</form:form>

</body>

</html>