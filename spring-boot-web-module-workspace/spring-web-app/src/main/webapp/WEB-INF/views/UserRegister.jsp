<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
	
<body>
 <form:form   method="POST" action="user/register">
     <h1>Registartion Form</h1>
     Name:     <input type="text" name="fullName"></br>
	 
	 Email:    <input type="text" name="email"></br>
	 
	 Password: <input type="password" name="password"></br>
	 
	 Contact:   <input type="text" name="contact"></br>
	 
	 <input type="submit" name="Register" value="Register">
 
	
 </form:form>	
</body>
</html>