<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.grails.web.Get, java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

table.id {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #13ece1;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #ffffff;
}
div.container {
  float:top;
  height: 100px;
  width: 100%;
  
 }
ul{
	list-style-type: none;
	margin: 0;
	padding: 0;
}


li{
	float: left;
}
a:link, a:visited{
display: block;
background-color:#1eb6e1;
width: 135px;
color: white;
text-decoration: none;
text-align: center;
padding: 5px;
}
a:hover,a:active{
background-color:#4686ec;
}

header {
    padding: 1em;
    color: white;
    background-color: #13ece1;
    clear: left;
    text-align: left;
}
header1{
text-align:right;
margin:24px 0 12px 0;

}

#leftContent {
  float:left;
  width: 35%;
  
 }

 #rightContent {
   float: right;
   width: 30%;
  
  }
  #containers {
  float:bottom;
  height: 50%;
  width: 100%;
  
 }
#leftContents {
  float:left;
  width: 50%;
  
  align: centre;
 }
 div ul{
 
 float: center;
 
 list-style-type: none;
 }

 #mainContents {
   float: right;
   width: 50%;
   align: centre;
   
  }

 #mainContent {
    width: 35%;
    float: right;
   
   
  }
</style>
</head>
<body >

<% String name =  request.getParameter("P.O Number");
	String Addr = request.getParameter("address");
	String age = request.getParameter("age");
	String Qual = request.getParameter("qual");
	String Persent = request.getParameter("percent");
	String Year = request.getParameter("yop"); %>

<div id="container" style="background-color:#afe9f5">
<header>
   <h3>CIMBIDIA</t>
   <header1>
   <img src="kitty.jpg" alt="Avatar" style="float:right" width=8% height=10% valign="middle"></t><button type="submit" style="float:right">GO</button></t>
   <input type="text" placeholder="search here" style="float:right" ></t>
   
   </header1>  
 </h3>
 </header>
<table border=0 style="width:100%;background-color:#1eb6e1;">
	<tr style="width:100%">
		<td style="width:100%">
			<ul>
				<li><a href="#">Purchase Orders</a></li>
				<li><a href="#">Customer Orders</a></li>
				<li><a href="#">ASNs</a></li>
				<li><a href="#">Shipments</a></li>
				<li><a href="#">Bookings</a></li>
				<li><a href="#">Invoice</a></li>
				<li><a href="#">Visibility</a></li>
				<li><a href="#">Cimchat</a></li>
				<li><a href="#">Settings</a></li>
			</ul>
		</td>
	</tr>
</table><p style="background-color:#5c7458;margin-top:0px;">NEW PURCHASE ORDER</p>
<div>
</table><p style="background-color:#5c7458;margin-top:0px;">NEW PURCHASE ORDER</p>
<div>
<table class="id">
  <tr>
    <td>checkbox</td>
    <td>supplier</td>
    <td>duedate</td>
    <td>postastus</td>
    <td>priority</td>
    <td>items</td>
    <td>shipfrom</td>    
    <td>transresp</td>
    <td>country</td>
    <td>ponumber</td>
    
  </tr>
 <% 
 ArrayList al =(ArrayList)request.getAttribute("gets");
 	
 for(int i=0; i<al.size(); i++){ 
	 Get get = (Get)al.get(i);
 %>
<tr >
		<td align="center">
			<input type="checkbox" name="select2">
		</td>
		
		<td>
			<%=get.getSupplier() %>
		</td>
		<td>
			<%=get.getDuedate() %>
		</td>
		<td>
			<%=get.getPostatus() %>
		</td>
		<td>
			<%=get.getPriority() %>
		</td>
		<td>
			<%=get.getItems() %>
		</td>
		<td>
			<%=get.getShipfrom() %>
		</td>
		<td>
			<%=get.getTransresp() %>
		</td>
		<td>
			<%=get.getCountry() %>
		</td>
		<td>
			<%=get.getPonumber() %>
		</td>
	</tr>
	<% }%>
	


</table>

</div>
</div>
</body>
</html>>