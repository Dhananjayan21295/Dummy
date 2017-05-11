<%--
  Created by IntelliJ IDEA.
  User: Dhananjayan
  Date: 4/28/2017
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.form.Insert2DBForm" %>
<%@ page import="com.EnitityClass.Purchaseorder" %>


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



<div id="container" style="background-color:#afe9f5">
    <header>
        <h3>CIMBIDIA</t>
            <header1>
                <img src="kitty.jpg" alt="Avatar" style="float:right" width=8% height=10% valign="middle"></t></t>
               <form action="/search.do"><input type="text" placeholder="search here" style="float:right" >
                   <input type="submit" style="float:right" value="Go"></form>

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
        </table>
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
                    <td>shipto</td>
                    <td>ponumber</td>

                </tr>
                <%
                    ArrayList al =(ArrayList)request.getAttribute("gets");

                    if(al != null){

                    for(int i=0; i<al.size(); i++){

                        Purchaseorder tab=( Purchaseorder)al.get(i);

                       // Get get = (Get)al.get(i);
                        %>
                <tr >
                    <td align="center">
                        <input type="checkbox" name="select2">
                    </td>

                    <td>
                        <%=tab.getDestignatedmode() %>
                    </td>
                    <td>
                        <%=tab.getDue_date() %>
                    </td>
                    <td>
                        <%=tab.getStatus() %>
                    </td>
                    <td>
                        <%=tab.getPriority() %>
                    </td>
                    <td>
                        <%=tab.getIncoterms() %>
                    </td>
                    <td>
                        <%=tab.getSeller() %>
                    </td>
                    <td>
                        <%=tab.getTransresp() %>
                    </td>
                    <td>
                        <%=tab.getCarrier() %>
                    </td>
                    <td>
                        <%=tab.getPonumber() %>
                    </td>
                </tr>
                <% }  }%>

        </div>
        </table>
        <form acton="/fun.do"><input type="submit" value="Next" name="submit"  size="100" style="height:50px;width:100px" ></form>
    </div>

</div>
</body>
</html>