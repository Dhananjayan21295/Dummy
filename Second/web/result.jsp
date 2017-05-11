<%--
  Created by IntelliJ IDEA.
  User: Dhananjayan
  Date: 4/29/2017
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.form.Insert2DBForm, java.util.ArrayList" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <table width="100%" align="center"
           style="border:1px solid #000000;">

        <tr style="background-color:lightgrey;width: 100%">
            <td><b>Supplier</b></td>
            <td><b>duedate</b></td>
            <td><b>postatus</b></td>
            <td><b>priority </b></td>
            <td><b>items </b></td>
            <td><b>ship from </b></td>
            <td><b>transresp </b></td>
            <td><b>country </b></td>
            <td><b>ponumber</b></td>
        </tr>
        <%
            int count = 0;
            String color = "#F9EBB3";
            if (request.getAttribute("piList") != null) {
                ArrayList al = (ArrayList) request.getAttribute("piList");
                System.out.println(al);
                Iterator itr = al.iterator();
                while (itr.hasNext()) {

                    if ((count % 2) == 0) {
                        color = "#eeffee";
                    }
                    count++;
                    ArrayList pList = (ArrayList) itr.next();
        %>
        <tr style="background-color:<%=color%>;">
            <td><%=pList.get(0)%></td>
            <td><%=pList.get(1)%></td>
            <td><%=pList.get(2)%></td>
            <td><%=pList.get(3)%></td>
            <td><%=pList.get(4)%></td>
            <td><%=pList.get(5)%></td>
            <td><%=pList.get(6)%></td>
            <td><%=pList.get(7)%></td>
            <td><%=pList.get(8)%></td>
        </tr>
        <%
                }
            }
            if (count == 0) {
        %>
        <tr>
            <td colspan=4 align="center"
                style="background-color:#eeffee"><b>No Record Found..</b></td>
        </tr>
        <%            }
        %>
    </table>
</div>
</body>
</html>
