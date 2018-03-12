<%@ page language="java" import="java.io.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<STYLE>
.main2 {
    position: absolute;
    bottom:25px;
    left: 500px;
}
</STYLE>
</head>
<body bgcolor="#99de687a">
<center>
 <%int number =Integer.parseInt(request.getParameter("msg")); %>
<h1>Here is Your QR Code Enjoy the Day!!!<%= number %> </h1>
 <a href="B:/QR_Code/QR_Images/img<%=number%>.jpg" > 
 
  <IMG display:"allow";  SRC="B:/QR_Code/QR_Images/<%=number%>.jpg"  WIDTH="420PX" HEIGHT="420PX"  ALIGN="center" />
 </a>
<div style="main2"  >
<a href="index.jsp">HOME</a>
 </div>
<br>
</center>
</body>
</html>