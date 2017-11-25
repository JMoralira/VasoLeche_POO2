<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
<script
	src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mantenimiento Usuarios</title>
</head>
<body>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-sm-3 col-md-3">
				<div class="panel-group" id="accordion">
									<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../asignaciones/">
								<span class="glyphicon glyphicon-file"></span>Asignaciones</a>
							</h4>
						</div>
					</div>
									<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../asignaciones/">
								<span class="glyphicon glyphicon-file"></span>Asignaciones</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../departamentos/"> <span
									class="glyphicon glyphicon-folder-close"></span>Departamentos
								</a>
							</h4>
						</div>

					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../usuarios/"> <span
									class="glyphicon glyphicon-folder-close"></span>Usuarios
								</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../permisos/"> <span class="glyphicon glyphicon-th"></span>Permisos
								</a>
							</h4>
						</div>

					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="#"> <span class="glyphicon glyphicon-user">
								</span>Escuelas
								</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../lotes/"> <span class="glyphicon glyphicon-file"></span>Lotes
								</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../entregas/"> <span
									class="glyphicon glyphicon-file"></span>Entregas
								</a>
							</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-9 col-md-9">
				<div class="well">
					<center>
						<h1>Lista de Usuarios</h1>
					</center>
					<br>
					<div class="container">
						<div class="row col-md-8 custyle">
							<table class="table table-striped custab">
								<thead>
									<a href="nuevoUsua" class="btn btn-primary btn-xs pull-right"><b>+</b>Nuevo
										Usuario</a>
									<tr>
										<th>Codigo</th>
										<th>Nombre</th>
										<th>Contraseña</th>
										<th>Correo electrónico</th>
										<th class="text-center">Action</th>
									</tr>
								</thead>
								<c:forEach var="usuaTemp" items="${listUsua}">
									<tr>
										<td><c:out value="${usuaTemp.codiUsua}" /></td>
										<td>${usuaTemp.nombUsua}</td>
										<td>${usuaTemp.contUsua}</td>
										<td>${usuaTemp.mailUsua}</td>
										<td class="text-center"><a class='btn btn-info btn-xs'
											href="editarUsua?codi=${usuaTemp.codiUsua}">Editar</a> <a
											class='btn btn-info btn-xs'
											href="eliminarUsua?codi=${usuaTemp.codiUsua}">Eliminar</a></td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<!-------------------------------------------------------------  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mantenimiento de Usuarios</title>
</head>
<body>
	<h1>Lista de usuarios</h1>
	<h3>
	    <a href="nuevoUsua">Nuevo usuario</a>
	</h3>
	<table border="1">	
	    <th>Código</th>
	    <th>Nombre</th>	
	    <th>Descripción</th>	    
	    <c:forEach var="usuaTemp" items="${listUsua}">
	        <tr>
	            <td><c:out value = "${usuaTemp.codiUsua}"/></td>
	            <td>${usuaTemp.nombUsua}</td>
	            <td>${usuaTemp.contUsua}</td>
	            <td>${usuaTemp.mailUsua}</td>
	            <td>
		            <a href="editarUsua?codi=${usuaTemp.codiUsua}">Editar</a>
	                <a href="eliminarUsua?codi=${usuaTemp.codiUsua}">Eliminar</a>
                </td>
	        </tr>
	    </c:forEach>
	</table>
</body>
</html-->