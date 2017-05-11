<%--
  Created by IntelliJ IDEA.
  User: Dhananjayan
  Date: 4/27/2017
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


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

<form action="Login.do">
    <div class="corners">
        <div class="container">
            <div style="text-align: center;"><label><b><strong>LOGIN TO YOUR PERSONAL ACCOUNT</strong></b></label> </div><br/>

            <div style="text-align: center;">  <input type="text" placeholder="Enter Username" name="username" required></div><br/>


            <div style="text-align: center;"> <input type="password" placeholder="Enter Password" name="password" required></div><br/>


            <div style="text-align: center;"><button type="submit" color="MediumTurquoise" style="box-shadow: 4px 4px 2px #888888" value="submit" align="right">
                <strong>Login</strong>
                </button></div>
            </br>


        </div>
    </div>
</form>
</body>
</html>


