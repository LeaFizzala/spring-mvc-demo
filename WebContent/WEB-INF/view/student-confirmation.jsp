<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>


<html>
<head>
<title> Student Confirmation Form</title>
</head>

<body>

	<h1> Welcome to Greendale !</h1>
	
	<p>
	The student is confirmed : ${student.firstName} ${student.lastName}
	
	<br><br>
	
	Country : ${student.country}
	
	<br><br>
	
	Favorite language : ${student.favoriteLanguage}
	
	<br><br>
	
	Operating systems you can use : 
	
	<ul>
	
		<c:forEach var="temp" items="${student.operatingSystems}"> <!-- Using the JSTL for the loop -->
		
		<li> ${temp} </li>
		
		</c:forEach>
	</ul>
	
	</p>
	
	
	

</body>

</html>