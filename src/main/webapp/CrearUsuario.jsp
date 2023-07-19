<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Crear usuario</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	<section class="fondo d-flex  justify-content-center">
		<section class="formCapacitacion d-flex flex-column  justify-content-center">
			<h1>Datos del Usuario</h1>
			<form action="CrearUsuario" method="POST" id="form" >
				<div class="nombreUsuario">
					<label class="form-label" for="nombreUsuario">Nombre de usuario:</label>
					<input class="form-control" placeholder="Ingresa su nombre" type="text" name="nombreUsuario" id="nombreUsuario">
					<p class="msjError text-danger"></p>
				</div>
				<div class="d-flex flex-column">
					<label class="form-label">Seleccione el tipo de usuario según su perfil: </label>
					<select id="tipoUsuario" name="tipoUsuario" class="form-control">	
						<option value="despliegue" selected>Despliegue las opciones</option>
						<option value="Administrativo">Administrativo</option>
						<option value="Cliente">Cliente</option>
						<option value="Profesional">Profesional</option>
					</select>
					
				</div>
				<div class="campoCliente">
				<!-- -CAMPOS INYECTADOS CON JS PARA EVITAR ENVIAR DATOS NULL O VACIOS -->	
				</div>
				
				<div class="campoProfesional">
				<!-- -CAMPOS INYECTADOS CON JS PARA EVITAR ENVIAR DATOS NULL O VACIOS -->	
				</div>
				
				<div class="campoAdministrativo">
				<!-- -CAMPOS INYECTADOS CON JS PARA EVITAR ENVIAR DATOS NULL O VACIOS -->		
				</div>
				
				<div class="d-flex justify-content-center botones mt-5 ">
					<button class="btn d-none"type="submit" id="btnCrearUsuario">Enviar</button>
					<button class="btn"type="reset">Borrar</button>
				
				</div>
			
			</form>
			<div class="volver mb-5 d-flex justify-content-cente">
				<a href="Index.jsp">Volver a página de inicio</a>
			</div> 
			
	
		</section>
		
	</section>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="JS/formUsuario.js"></script>
	<script src="JS/validarFormCrearUser.js"></script>
	
	
</body>
</html>