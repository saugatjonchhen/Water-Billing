<%-- 
    Document   : Display
    Created on : Aug 16, 2017, 9:45:40 PM
    Author     : Saugat
--%>

<%@page import="com.cusinfo.model.CharKillaInfo"%>
<%@page import="com.cusinfo.model.AddressInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.cusinfo.model.CustomerInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Details</h1>
        <table>
            <tr>
                <th>CustomerID:</th>
                <th>Applicant's First Name:</th>
                <th>Applicant's Middle Name:</th>
                <th>Applicant's Last Name:</th>
                <th>Parent's First Name:</th>
                <th>Parent's Middle Name:</th>
                <th>Parent's Last Name:</th>
                <th>Grand Parent's First Name:</th>
                <th>Grand Parent's Middle Name:</th>
                <th>Grand Parent's Last Name:</th>
                <th>Mobile Number</th>
                <th>CitizenShip Number</th>
                <th>Reason For Installation:</th>
                <th>No of members:</th>
                <th>Daily Consumption:</th>
                <th>Applicant's Photo:</th>
                <th>Land Owner's Photo:</th>
                <th>Citizenship Scan Photo:</th>
                <th>Electricity Bill Receipt:</th>
                <th>Naxa Pass Certificate:</th>
                <th>Registered Date</th>
                <th>Registered By</th>
                <th>State</th>
                <th>District</th>
                <th>Municipality</th>
                <th>Ward No</th>
                <th>House No</th>
                <th>East</th>
                <th>West</th>
                <th>North</th>
                <th>South</th>
                
                
            </tr>
            <tr>
            <%
                List<CustomerInfo> cuslist= (ArrayList) request.getAttribute("cList");
                if(cuslist==null){
                    response.sendRedirect("CustomerInfo2.jsp");
                }
                else
                {
                    for(CustomerInfo customer :cuslist){
                      %>
                      
                          <td><%=customer.getCustomerId()%> </td>
                          <td><%=customer.getApplicant_fname()%> </td>
                          <td><%=customer.getApplicant_mname()%> </td>
                          <td><%=customer.getApplicant_lname()%> </td>
                          <td><%=customer.getParents_fname()%> </td>
                          <td><%=customer.getParents_mname()%> </td>
                          <td><%=customer.getParents_lname()%> </td>
                          <td><%=customer.getGrand_parent_fname()%> </td>
                          <td><%=customer.getGrand_parent_mname()%> </td>
                          <td><%=customer.getGrand_parent_lname()%> </td>
                          <td><%=customer.getMobileNo()%></td>
                          <td><%=customer.getCitizenShipNumber()%></td>
                          <td><%=customer.getReason_for_installation()%> </td>
                          <td><%=customer.getNo_of_members()%> </td>
                          <td><%=customer.getDaily_Consumption()%> </td>
                          <td><%=customer.getApplicant_Photo()%> </td>
                          <td><%=customer.getLand_Owner_Photo()%> </td>
                          <td><%=customer.getCitizenship_Scan_Certificate()%> </td>
                          <td><%=customer.getElectricity_Bill_Reciept()%> </td>
                          <td><%=customer.getNaxa_Pass_Certificate()%> </td>
                          <td><%=customer.getRegisteredDate()%> </td>
                          <td><%=customer.getRegisteredBy()%> </td>
                      
                      <% 
                    }
                }
                %>
                
                <%
                List<AddressInfo> addlist= (ArrayList) request.getAttribute("aList");
                if(cuslist==null){
                    response.sendRedirect("CustomerInfo2.jsp");
                }
                else
                {
                    for(AddressInfo address :addlist){
                      %>
                      
                          <td><%=address.getState()%> </td>
                          <td><%=address.getDistrict()%> </td>
                          <td><%=address.getMunicipality()%> </td>
                          <td><%=address.getWard_no()%> </td>
                          <td><%=address.getHouse_no()%> </td>
                      
                      <% 
                    }
                }
                %>
                
                <%
                List<CharKillaInfo> cklist= (ArrayList) request.getAttribute("ckList");
                if(cuslist==null){
                    response.sendRedirect("CustomerInfo2.jsp");
                }
                else
                {
                    for(CharKillaInfo ckinfo :cklist){
                      %>
                      
                          <td><%=ckinfo.getEast()%> </td>
                          <td><%=ckinfo.getWest()%> </td>
                          <td><%=ckinfo.getNorth()%> </td>
                          <td><%=ckinfo.getSouth()%> </td>
                      
                      <% 
                    }
                }
                %>
                <tr />
               </table>
    </body>
</html>
