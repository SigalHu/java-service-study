<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/style.css" />">
</head>
<body>
<h1>Register</h1>

<form method="POST" enctype="multipart/form-data">
    First Name: <input type="text" name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Email: <input type="email" name="email"/><br/>
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    Profile Picture:<input type="file" name="profilePicture"
                           accept="image/jpeg,image/png,image/gif" /><br/>
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}" />
    <input type="submit" value="Register"/>
</form>
</body>
</html>
