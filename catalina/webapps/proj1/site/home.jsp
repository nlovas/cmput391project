<%@ page import="java.util.*" %>
<html>
<head>
<title>Welcome</title>
</head>
<body>

<table border="1" width = "1650" height = "1000" cellpadding = "15" cellspacing = "10" bgcolor="#bedbeb">

<tr bgcolor="#FFFFFF">
<td height = "20%">put header here</td>
</tr>

<tr bgcolor="#FFFFFF">
<td><form method ="post" action="login.jsp" name="loginForm"> Sign in:
<br>
<input type="text" value = "username" name="username"></input> 
<br>
<input type="password" value = "password" name="password"></input>
<br>
<input type = "submit" value = "Log in" name = "submit"></input>
</form>
<br>

<%
/*get the current URL so I can make a link to the sign up page without worrying about which computer I'm running this from */

String url = request.getRequestURL().toString();
url = url.replace("home.jsp","sign_up.html");
%>

<font size = "2"><i>Not a member? <a href = "<%=url%>">Sign up.</i></font></a>
</td>
</tr>

</table>

</body>
</html>
