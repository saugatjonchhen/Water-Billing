<%-- 
    Document   : newjsp
    Created on : Aug 5, 2017, 11:25:49 AM
    Author     : Saroj
--%>

<%@page import="com.cusinfo.model.CustomerInfo"%>
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
            List<CustomerInfo> returnList = (List<CustomerInfo>) request.getAttribute("list");
            CustomerInfo mod = (CustomerInfo) request.getAttribute("input"); 
        %>


        <form action="CusSearchController" method="POST">
            First Name:<input type="text" name="fname" value="<%if(mod!=null) out.print(mod.getApplicant_fname());%>">
            Surname:<input type="text" name="sname" value="<%if(mod!=null) out.print(mod.getApplicant_lname());%>">
            Middle Name:<input type="text" name="mname" value="<%if(mod!=null) out.print(mod.getApplicant_mname());%>">
            Customer id:<input type="Number" name="Cusid">
            Registered date:<input type="Date" name="rdate">
            <input type="submit" name="submit">
        </form>
            <a href="CustomerInfo2.jsp">Insert New Customer</a><br />
            <a href="ViewAllRecords.jsp">View All Records</a><br />
            Customer Id:<input type="text" name="cusid">
            <input type="button" value="Edit" onclick=""/>

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
                    for (CustomerInfo model : returnList) {
                        i++;%>
                <td><%=i%> </td>
                <td><%out.println(model.getRegistration_no());%></td>
                <td><% out.println(model.getApplicant_lname()+ ", " + model.getApplicant_fname()+ " " + model.getApplicant_mname());%></td>
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