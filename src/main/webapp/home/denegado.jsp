<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Acceso denegado</title>
</head>
<body>
	<div class="container">
	
	<div class="jumbotron">
	 <h1 style="color:red">No tienes permisos de ver esta pagina</h1>
    <h2>No estas autorizado de ver esta pagina, por favor cierra la sesion o cambia de pagina.</h2>
   	<a href="<c:url value="/home/logout" />"> <h2 style="color:green">Cerrar Sesión</h2></a>

</body>
</html>