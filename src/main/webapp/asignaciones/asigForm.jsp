<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/css/bootstrap.min.css"/>
<script	src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asignación de usuarios-permisos</title>
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
								<a href="../departamentos/">
								<span class="glyphicon glyphicon-folder-close"></span>Departamentos</a>
							</h4>
						</div>
						
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../usuarios/">
								<span class="glyphicon glyphicon-folder-close"></span>Usuarios</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../permisos/">
								<span class="glyphicon glyphicon-th"></span>Permisos</a>
							</h4>
						</div>

					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="#">
								<span class="glyphicon glyphicon-user"> </span>Escuelas</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../lotes/">
								<span class="glyphicon glyphicon-file"></span>Lotes</a>
							</h4>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a href="../entregas/">
								<span class="glyphicon glyphicon-file"></span>Entregas</a>
							</h4>
						</div>
					</div>
				</div>
			</div>
						<div class="col-sm-9 col-md-9">
				<div class="well">
		<center><h1>Lista de Asignaciones</h1></center>
		<br>
					<div class="container">
						<div class="row col-md-8 custyle">
	<h1>Nuevo asignación</h1>
	<form:form action="guardarAsig" method="post" modelAttribute="objeAsig">
		<form:hidden path="codiAsig"/>
		<form:select path="usuario.codiUsua">
			<form:option value="">Seleccion un usuario</form:option>
			<c:forEach var="usuaTemp" items="${listUsua}">
			  <form:option value="${usuaTemp.codiUsua}">${usuaTemp.nombUsua}</form:option>
			</c:forEach>
		</form:select>
		<form:select path="permiso.codiPerm">
			<form:option value="">Seleccion un permiso</form:option>
			<c:forEach var="permTemp" items="${listPerm}">
			  <form:option value="${permTemp.codiPerm}">${permTemp.nombPerm}</form:option>
			</c:forEach>
		</form:select>
		<input type="submit" value="Guardar" />
	</form:form>
</body>
</html>