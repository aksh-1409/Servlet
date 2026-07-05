<%@ page import="java.util.ArrayList" %>
<!--directive-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>index page...</h1>
    <hr>
    
    <% ArrayList<String> names = new ArrayList<>(); %>
    <% names.add("mohan"); %>
    <% names.add("rohan"); %>
    <% names.add("mohan"); %> 
    
    <h1>All records</h1>

    <%--
    <% 
        for(String next: names){
            out.write(<h1>+next+</h1>);
        }
        
    %>
    --%>

    <% for(String next:names){  %>
        <h1> <%= next %></h1>
    <% } %>
    
</body>
</html>