<%-- 
    Document   : CustomerInfo
    Created on : Aug 15, 2017, 8:49:35 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Information Entry</title>
    </head>
    <body>
        
        <form action="CusController" method="POST">
            <div>
            CustomerID:
            <input type ='text' name='customerid' required="">
            </div>
            <div>
            Applicant's First Name:
            <input type ='text' name='appFName' required="">
            </div>
            <div>
            Applicant's Middle Name:
            <input type="text" name="appMName">
            </div>
            <div>
            Applicant's Last Name:
            <input type="text" name="appLName" required="">
            </div>
            <div>
            Parent's First Name:
            <input type="text" name="appPFName" required="">
            </div>
            <div>
            Parent's Middle Name:
            <input type="text" name="appPMName">
            </div>
            <div>
            Parent's Last Name:
            <input type="text" name="appPLName" required="">
            </div>
            <div>
            Grand Parent's First Name:
            <input type="text" name="appGFName" required="">
            </div>
            <div>
            Grand Parent's Middle Name:
            <input type="text" name="appGMName">
            </div>
            <div>
            Grand Parent's Last Name:
            <input type="text" name="appGLName" required="">
            </div>
            <div>
            Reason For Installation:
<!--            <input type="text" name="Reason">-->
            <textarea name='reason' required=""> </textarea>
            </div>
            <div>
            No of members:
            <input type="number" name="noOfMember" required="">
            </div>
            <div>
            Daily Consumption:
            <input type="number" name="dConsumption" required="">
            </div>
            <div>
            Applicant's Photo:
            <input type="text" name="aPhoto" required="">
            </div>
            <div>
            Land Owner's Photo:
            <input type="text" name="lPhoto" required="">
            </div>
            <div>
            Citizenship Scan Photo:
            <input type="text" name="cPhoto" required="">
            </div>
            <div>
            Electricity Bill Receipt:
            <input type="text" name="billReceipt" required="">
            </div>
            <div>
            Naxa Pass Certificate:
            <input type="text" name="certificate" required="">
            </div>
            <div>
            Address:
            </div>
            <div>
            State:
            <input type="text" name="state" required="">
            </div>
            <div>
            District:
            <input type="text" name="district" required="">
            </div>
            <div>
            Municipality:
            <input type="text" name="municipality" required="">
            </div>
            <div>
            Ward_no:
            <input type="text" name="wardNumber" required="">
            </div>
            <div>
            House_No;
            <input type="text" name="houseNo" required="">
            </div>
            <div>
            CharKillInformation:
            </div>
            <div>
            East:
            <input type="text" name="east" required="">
            </div>
            <div>
            West:
            <input type="text" name="west" required="">
            </div>
            <div>
            North:
            <input type="text" name="north" required="">
            </div>
            <div>
            South:
            <input type="text" name="south" required="">
            </div>
            <div>
                <input type='submit' value='Submit'>
            </div>
        </form>
    </body>
</html>
