<%@ page import="java.io.*,java.util.*" %>
<html>
<style>
        .content {
            max-width: 500px;
            margin:auto
        }
</style>
<head>
    <title>Display Entered Info</title><!-- need .css -->
    <link rel="stylesheet" href="asg10Style.css">
    
</head>
<body>
<% 
    // get parameters from the request object
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String collegeName = request.getParameter("collegeName");
    String phoneNumber = request.getParameter("phoneNumber");
%>

<div class="content">
<h1>Thanks for testing me. </h1><!-- comment -->
<h2>Here is what you entered:</h2>
<table class="inline-block">
    <tr><th id="th-id1" colspan="2">Information Entered</th></tr>
    <tr>
        <td>First Name:</td><!-- comment -->
        <td><%= firstName %></td><!-- comment -->
    </tr>
    
    <tr>
        <td>Last Name:</td><!-- comment -->
        <td><%= lastName %></td><!-- comment -->
    </tr>
    
    <tr>
        <td>College Name:</td><!-- comment -->
        <td><%= collegeName %></td><!-- comment -->
    </tr>
    
    <tr>
        <td>Phone Number:</td><!-- comment -->
        <td><%= phoneNumber %></td><!-- comment -->
    </tr>
    
</table><!-- comment -->
</div><!-- comment -->
</body><!-- comment -->
</html><!-- comment -->
