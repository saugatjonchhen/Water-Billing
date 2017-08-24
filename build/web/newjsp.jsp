<%-- 
    Document   : newjsp
    Created on : Aug 5, 2017, 11:25:49 AM
    Author     : Saroj
--%>

<%@page import="com.search.TestModel"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link href="bootstrap.min.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <%
            List<TestModel> returnList = (List<TestModel>) request.getAttribute("list");
            TestModel mod = (TestModel) request.getAttribute("input"); 
        %>


        <form action="SearchController" method="POST">
            First Name:<input type="text" name="fname" value="<%if(mod!=null) out.print(mod.getFName());%>">
            Surname:<input type="text" name="sname" value="<%if(mod!=null) out.print(mod.getLName());%>">
            Middle Name:<input type="text" name="mname" value="<%if(mod!=null) out.print(mod.getMName());%>">
            Customer id:<input type="Number" name="Cusid">
            Registered date:<input type="date" name="rdate">
            <input type="submit" name="submit">
        </form>

        <%if (returnList != null) {%>
        <div class="container" style="margin-top: 50px">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>S.N</th>
                        <th>Customer Id</th>
                        <th>Name</th>
                        <th>Address</th>
                        <th>mobile no</th>
                        <th>Registered Date</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <%if (returnList.isEmpty()) {%>
                <h1 style="text-align: center">No data found</h1>
                <%} else {
                    int i = 0;
                    for (TestModel model : returnList) {
                        i++;%>
                <td><%=i%> </td>
                <td><%out.println(model.getId());%></td>
                <td><% out.println(model.getLName() + ", " + model.getFName() + " " + model.getMName());%></td>
                <td>mob</td>
                <td>add </td>
                <td><% out.println(model.getRegisteredDate());%> </td>
                </tr>
                <%} //for closing%>
                </tbody>
            </table>
            <%} }%>
        </div>

    </body>
</html>