<%-- 
    Document   : Interface
    Created on : Aug 18, 2017, 8:47:07 AM
    Author     : Saugat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Interface</title>
    </head>
    <body>
        <form name="interface" method="POST" action="">
            <div>
                FirstName:
                <input type="text" name="fName"/>
            </div>
            <div>
                LastName:
                <input type="text" name="lName" />
            </div>
            <div>
                CustomerId:
                <input type="text" name="customerId" />
            </div>
            <div>
                <input type="submit" value="Search" name="search">
            </div>
        </form>
        <div>
            <form name="viewAll" action="" method="POST">
                <input type="submit" value="View ALL" name="viewAll">
            </form>
            <form>
                <input type="submit" value="Register New Customer" name="register">
            </form>
        </div>
    </body>
</html>
