<%-- 
    Document   : invoice
    Created on : Aug 1, 2017, 4:58:53 PM
    Author     : Saroj
--%>

<%@page import="com.bill.calculator.YearMonth_Name_extractor"%>
<%@page import="com.bill.model.invoice"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        Boolean found_id = (Boolean) session.getAttribute("found_id");
        ArrayList<invoice> lis = (ArrayList) session.getAttribute("cList");
        int temp=-5;
        String btn="";
        if(found_id==null && lis == null){
            temp=1;
            btn="Check";
        }
        else  if(found_id==false){
            temp=2; //try again
            btn="Search - Again";
        }
        else if(found_id==true && lis.isEmpty()){
            temp=3; //try agains
            btn="No - Data";
        }
        else{
            temp=4;
            btn = "Pay - Bill";
        }
        YearMonth_Name_extractor yr = new YearMonth_Name_extractor();
        Double netAmt=0.0;
    %>
    <body>
        <%if(temp == 1 ||temp == 2){%>
        <h1>Enter Customer id</h1>
        <form action="invoiceController" method="post">
        <input type="text" value="1a" name="Cus_id">
        <button type="submit" value="<%out.println(temp);%>">Check</button>
        </form>
        <%}else if(temp==3){%>
        <h1>No Bills</h1>
        <%}else{%>
        <table>
            <tr>
                <th>Bill Amt</th>
                <th>Dsc/Fine</th>
                <th>Upto</th>
            </tr>
            <%for(invoice in: lis){%>
            <tr>
                <% Double temp1= in.getBill_amt();%>
                <td><input type="Number" name="bill_amt" readonly="" value="<%=temp1%>"></td>
                <td><%if(in.getFine()>0)out.println("+"); else out.println("-");%>
                    <% out.print(in.getFine()+in.getDiscount());%></td>
                <td><% out.println(yr.YearMonth_Name_extractor(in.getInvoice_date()));%></td>
                <%netAmt=netAmt+in.getBill_amt()+in.getFine()-in.getDiscount();%>
            </tr>
            <%}%>
            <tr>
                <td colspan="2" style="text-align: right">Total</td>
                <td><%=netAmt%></td>
            </tr>
        </table>
            
        <%}%>
        <button name="PayBill" value="<%out.println(temp);%>"><%=btn%></button>
    </body>
</html>