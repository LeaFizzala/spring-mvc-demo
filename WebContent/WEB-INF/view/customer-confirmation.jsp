<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<title>Customer Confirmation</title>

</head>

<body>

<p>

The customer is confirmed : ${customer.firstName} ${customer.lastName }

<br><br>

Number of free passes : ${customer.freePasses }

<br><br>

Postal code : ${customer.postalCode }
<br><br>

Course code : ${customer.courseCode }
</p>

</body>