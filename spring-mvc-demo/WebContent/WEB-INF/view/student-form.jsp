<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form </title>
</head>
<body>
<!--  the modelAttribute most match the value in the controller -->
<!--  When we load the form spring mvc will call the getter methods (getFirstName..) -->
<!--  When we submit the form spring mvc will call the setter methods(setLastName..) -->
 <form:form action="processForm" modelAttribute="student"> 
 
 First Name : <form:input path="firstName"/>
 
 <br><br>
 
 Last Name : <form:input path="lastName"/>
 
 <br><br>
 
 Country   : <form:select path="country"> 		
 				<form:options items="${theCountryOptions}"></form:options>	
             </form:select>
 <br><br>   
 
 Favorite Language : 
 <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguages }"/>
<br><br> 

Operating Systems:
 Linux : <form:checkbox path="operatingSystems" value = "linux"/>
 Mac Os  : <form:checkbox path="operatingSystems" value = "Mac OS"/>
 Ms Windows  : <form:checkbox path="operatingSystems" value = "MS Windows"/>

<br><br>              
 <input type="submit" value="submit"/>
 
 </form:form>


</body>
</html>