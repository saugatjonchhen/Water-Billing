<%-- 
    Document   /* global Message */

: insertreading
    Created on : Jul 18, 2017, 5:48:12 PM
    Author     : Saroj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="insertreadingController" method="post">
            <input type="number" name="reading_input">
            <% 
                Boolean retval = (Boolean) session.getAttribute("Message");    
            %>
            
            
            <% 
                if((retval!=null)&&(retval == false ))
                {
                    %>
                    <script>
                        alert("!!! Error Occured !!!");
                    </script>
                    <span> current reading must be greater</span>
                    <%
                }else if((retval!=null)&&(retval == true))
                {%>
                <script>
                    alert("!!! Successfull !!!")
                </script>
            <%}%>
            <button type="submit">submit</button>
        </form>
    </body>
</html>
