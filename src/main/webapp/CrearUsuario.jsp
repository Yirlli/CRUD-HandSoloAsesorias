<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<section class="fondo d-flex flex-column ">
		<section class="formCapacitacion d-fex align-center"> 
			<h1>Datos del Usuario</h1>
			<form action="CrearUsuario" method="POST">
				<div>
					<label class="form-label">Nombre de usuario(para el inicio de sesión):</label>
					<input class="form-control" placeholder="Ingresa su nombre" type="text" name="nombreUsuario" id="nombreUsuario">
				</div>
				<div>
					<label class="form-label">Fecha de nacimiento:</label>
					<input  class="form-control" type="date"name="fechaNacimiento" id="">
				</div>
				<div>
					<label class="form-label">RUN: </label>
					<input class="form-control" type="text" placeholder="Ingresa su RUN, sin guion, con digito verificador" name="run" id="run">
				</div>
				<div class="d-flex flex-column">
					<label class="form-label">Seleccione el tipo de usuario según su perfil: </label>
					<select id="tipoUsuario">	
						<option value="despliegue" selected>Despliegue las opciones</option>
						<option value="Administrativo">Administrativo</option>
						<option value="Cliente">Cliente</option>
						<option value="Profesional">Profesional</option>
					</select>
					
				</div>
				<div class="d-none campoCliente">
					<label class="form-label" >Nombres:</label>
					<input class="form-control" type="text" placeholder="Ingresa sus nombres"name="nombreCliente" id="nombreCliente">
					<label class="form-label">Apellidos:</label>
					<input class="form-control" type="text" placeholder="Ingresa sus apellidos" name="apellidoCliente" id="apellidoCliente">
					<label class="form-label">Teléfono:</label>
					<input class="form-control" type="number" placeholder="Ingrese el número de teléfono (+56)" name="tlfCliente" id="tlfCliente">
					<label class="form-label" n>AFP:</label>
					<input class="form-control" type="text" placeholder="Ingrese la AFP afiliada" name="afp" id="afp">
					<label class="form-label" n>AFP:</label>
					<input class="form-control" type="text" placeholder="Ingrese la AFP afiliada" name="afp" id="afp">
					<label class="form-label">Sistema de salud:</label>
					<input class="form-control" type="number" placeholder="Ingrese 1 para fonasa / Ingrese 2 para Isapre" name="sistemaSalud" id="sistemaSalud">
					<label class="form-label" >Dirección:</label>
					<input class="form-control" type="text" placeholder="Ingrese su dirección de domicilio" name="direccion" id="direccion">
					<label class="form-label" >Comuna:</label>
					<input class="form-control" type="text" placeholder="Ingrese la comuna" name="comuna" id="comuna">
					<label class="form-label" >Edad:</label>
					<input class="form-control" type="number" placeholder="Ingrese su edad" name="edad" id="edad">
				</div>
				
				<div class="d-none campoProfesional">
					<label class="form-label">Título:</label>
					<input class="form-control" type="text" placeholder="Ingrese su titulo profesional" name="titulo"id="titulo">
					<label class="form-label">Fecha de ingreso:</label>
					<input class="form-control" type="date" placeholder="Ingrese la fecha de ingreso" name="fechaIngreso" id="fechaIngreso">
				</div>
				
				<div class="d-none campoAdministrativo">
					<label class="form-label">Área:</label>
					<input class="form-control" type="text" placeholder="Ingrese el área al que corresponde" name="area" id="area">
					<label class="form-label">Experiencia Previa:</label>
					<input class="form-control" type="text" placeholder="Ingrese su experiencia previa" name="experienciaPrevia" id="experienciaPrevia">
				</div>
				
				<div class="d-flex justify-content-center">
					<button class="btn"type="submit">Enviar</button>
					<button class="btn"type="reset">Borrar</button>
				
				</div>
			
			</form>
		</section>

	<script src="JS/formUsuario.js"></script>
</body>
</html>