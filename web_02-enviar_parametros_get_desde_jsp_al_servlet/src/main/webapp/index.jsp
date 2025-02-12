<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Enviar peticiones GET desde 'index.jsp' hacia 'MyServlet' -->
	<!-- con parámetros, 'var1' que su valor es '2' -->
	<!-- con & se envian más parámetros  -->
	<!-- 'var2' que su valor es '6'  -->
	<a href="MyServlet?var1=2&var2=6">Enviar</a>
</body>
</html>