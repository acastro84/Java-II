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
    String favoriteSport = request.getParameter("favoriteSport");
    String favoriteTeam = request.getParameter("favoriteTeam");
    String favoritePlayer = request.getParameter("favoritePlayer");
    String text = request.getParameter("text");
%>

<div class="content">
<h1>Thanks for your favorites! </h1><!-- comment -->
<h2>Here is what you entered:</h2>
<table class="inline-block">
    <tr><th id="th-id1" colspan="2">Your Favorites</th></tr>
    <tr>
        <td>Favorite Sport:</td><!-- comment -->
        <td><%= favoriteSport %></td><!-- comment -->
    </tr>
    
    <tr>
        <td>Favorite Team:</td><!-- comment -->
        <td><%= favoriteTeam %></td><!-- comment -->
    </tr>
    
    <tr>
        <td>Favorite Player:</td><!-- comment -->
        <td><%= favoritePlayer %></td><!-- comment -->
    </tr>
    
    <tr>
        <td>Your reason:</td><!-- comment -->
        <td><%= text %></td><!-- comment -->
    </tr>
   
    
</table><!-- comment -->
</div><!-- comment -->
</body><!-- comment -->
</html><!-- comment -->
