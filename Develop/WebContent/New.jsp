<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>JSP Page</title>  
 
 <style>
 
 
 div.corners {
  background-color:#CCCCCC;
    color: white;
    width: 650px;
    padding: 100px;
    margin: 70px;
   }
 body{
 background-color:#CCCCCC;
 }
div.container {
align:center;
   border-radius: 50px;
    background: #73AD21;
    padding: 100px; 
    width: 550px;
    height: 150px; 
    box-shadow: 10px 5px 10px #888888;
    
} 
</style>
 </head> 
 <body>
 
 <form action="test">
 <div class="corners">
  <div class="container">
    <center><label><b><strong>LOGIN TO YOUR PERSONAL ACCOUNT</strong></b></label> </center><br/>
    
   <center>  <input type="text" placeholder="Enter Username" name="user" required></center><br/>

  
   <center> <input type="password" placeholder="Enter Password" name="pass" required></center><br/>


 <center><button type="submit" color="MediumTurquoise" style="box-shadow: 4px 4px 2px #888888" onclick="location.href="http://localhost:9090/Develop/test1" align="right"><strong>Login</strong></button></center>
  </br>
   <center> <span class="pass"><i>Forget Your Username</i></br>
   <i>or Password?</i> <a href="#">Click here to Reset</a></span></center>
   
    </div>
  </div>
</form>
 </body>
   </html>

