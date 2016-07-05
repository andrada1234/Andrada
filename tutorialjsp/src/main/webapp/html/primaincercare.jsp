<%! int day = 2; %> 
<%! int fontSize; %>
<html>
<head><title>Hello World</title></head>
<body>
Hello World!!!!!!!!!!!!!!<br/>
<%
out.println("Your IP address is " + request.getRemoteAddr());
%>
<p>
 Today's date: <%= (new java.util.Date()).toLocaleString()%>
 </p>
 <p>
 <% if (day == 1 | day == 7) { %>
      <p> Today is weekend</p>
<% } else { %>
      <p> Today is not weekend</p>
<% } %>
</p>

<p>


<% 
switch(day) {
case 0:
   out.println("It\'s Sunday.");
   break;
case 1:
   out.println("It\'s Monday.");
   break;
case 2:
   out.println("It\'s Tuesday.");
   break;
case 3:
   out.println("It\'s Wednesday.");
   break;
case 4:
   out.println("It\'s Thursday.");
   break;
case 5:
   out.println("It\'s Friday.");
   break;
default:
   out.println("It's Saturday.");
}
%>
</p>
<p>

<%for ( fontSize = 1; fontSize <= 3; fontSize++){ %>
   <font color="green" size="<%= fontSize %>">
    JSP incercare mica si tot mai mare
   </font><br />
<%}%>
</p>
</body>
</html>