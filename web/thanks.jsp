<%--
    Document   : thanks
    Created on : Jan 17, 2024, 12:13:44 a.m.
    Author     : Taeguk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css"/>
        <title>Thank you</title>
    </head>
    <body>
        <h1>Thanks for joining our email list</h1>
        <p>Here is the information that you have entered</p>

        <label>Eamil:</label>
        <span>${user.email}</span><br>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>

        <p>Click the back button to submit another email address</p>

        <<form action="" method="get">
            <input type="hidden" name="action" value="back">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
