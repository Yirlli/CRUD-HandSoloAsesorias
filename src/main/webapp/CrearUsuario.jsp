<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Crear usuario</title>
</head>
<body>
	<section class="fondo d-flex flex-column  ">
		<section class="formCapacitacion d-fex align-items-center"> 
			<h1>Datos del Usuario</h1>
			<form action="CrearUsuario" method="POST" id="form" >
				<div class="nombreUsuario">
					<label class="form-label" for="nombreUsuario">Nombre de usuario(para el inicio de sesión):</label>
					<input class="form-control" placeholder="Ingresa su nombre" type="text" name="nombreUsuario" id="nombreUsuario">
					<p class="msjError text-danger"></p>
				</div>
				<div class="fechaNacimiento">
					<label class="form-label" for="fechaNacimiento">Fecha de nacimiento:</label>
					<input  class="form-control" type="date"name="fechaNacimiento" id="fechaNacimiento">
					<p class="msjError text-danger"></p>
				</div>
				<div class="run">
					<label class="form-label" for="run">RUN: </label>
					<input class="form-control" type="text" placeholder="Ingresa su RUN, sin guion, con digito verificador" name="run" id="run">
					<p class="msjError text-danger"></p>
				</div>
				<div class="d-flex flex-column">
					<label class="form-label">Seleccione el tipo de usuario según su perfil: </label>
					<select id="tipoUsuario" name="tipoUsuario">	
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
				
				<div class="d-flex justify-content-center">
					<button class="btn d-none"type="submit" id="btnCrearUsuario">Enviar</button>
					<button class="btn"type="reset">Borrar</button>
				
				</div>
			
			</form>
			<div class="volver">
				<a href="Index.jsp">Volver a página de inicio</a>
			</div>
	
	</section>
		</section>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="JS/formUsuario.js"></script>
	<script src="JS/validarFormCrearUser.js"></script>
	
	
</body>
</html>