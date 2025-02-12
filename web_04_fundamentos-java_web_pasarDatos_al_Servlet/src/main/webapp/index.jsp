<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>
<body>
	<h1>Datos del registro</h1>
	<form action="SvUsuarios" method="post">
		<p><label>DNI:</label><input type="text" name="dni" /></p>
		<p><label>Nombre:</label><input type="text" name="nombre" /></p>
		<p><label>Apellido:</label><input type="text" name="apellido" /></p>
		<p><label>Teléfono:</label><input type="text" name="telefono" /></p>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>