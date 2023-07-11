<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Formulario crear capacitacion</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>

	<section class="fondo d-flex flex-column">
		<section class="formCapacitacion"> 
			<h1 class="text-center">Datos de la capacitación</h1>
			<form action="CrearCapacitacion" method="POST" id="form" >
				<div class="d-flex flex-column align-items-center">
					<div class="idCapacitacion">
						<label class="form-label">Número identificador:</label>
						<input class="form-control" placeholder="Ingresa el n° de indetificador" type="number" name="idCapacitacion" id="idCapacitacion" required>
						<p class="msjError text-danger"></p>
					</div>
					<div class="rutCliente">
						<label class="form-label">Rut del Cliente:</label>
						<input  class="form-control" type="number"placeholder="Ingrese el Rut del cliente sin guion"name="rutCliente" id="rutCliente" required>
						<p class="msjError text-danger"></p>
					</div>
					<div class="dia">
						<label class="form-label">Día: </label>
						<input class="form-control" type="text" placeholder="Ingresa el dia (lunes a domingo)" name="dia" id="dia">
						<p class="msjError text-danger"></p>
					</div>
					<div class="hora">
						<label class="form-label">Hora: </label>
						<input class="form-control" type="time"  placeholder="Ingresa la hora en formato HH:MM" name="hora" id="hora">
						<p class="msjError text-danger"></p>
					</div>
					<div class="lugar">
						<label class="form-label">Lugar:</label>
						<input class="form-control" type="text" placeholder="Ingresa el lugar de la capacitacion"name="lugar" id="lugar" required>
						<p class="msjError text-danger"></p>
					</div>
					<div class="duracion">
						<label class="form-label">Duracion:</label>
						<input class="form-control" type="number" placeholder="Ingresa la duración en horas" name="duracion" id="duracion">
						<p class="msjError text-danger"></p>
					</div>
					<div class="cantidadAsistentes">
						<label class="form-label">Cantidad de asistentes:</label>
						<input class="form-control" type="number" placeholder="Ingresa la cantidad de asistentes" name="cantidadAsistentes" id="cantidadAsistentes" required>
						<p class="msjError text-danger"></p>
					</div>
				</div>
			
				
				<div class="d-flex justify-content-center">
					<button class="btn"type="submit">Enviar</button>
					<button class="btn"type="reset">Borrar</button>
				
				</div>
			
			</form>
		</section>
	
	<div class="volver">
				<a href="Index.jsp">Volver a página de inicio</a>
			</div>
	
	</section>
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="JS/validarFormCapacitacion.js"></script>

</body>
</html>