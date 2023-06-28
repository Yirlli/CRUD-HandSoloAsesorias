<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Formulario crear capacitacion</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>

	<section class="fondo d-flex flex-column ">
		<section class="formCapacitacion d-fex align-center"> 
			<h1>Datos de la capacitación</h1>
			<form action="CrearCapacitacion" method="POST">
				<p>
					<label class="form-label">Número de identificador:</label>
					<input class="form-control" placeholder="Ingresa el n° de indetificador" type="text" name="idCapacitacion">
				</p>
				<p>
					<label class="form-label">Rut del Cliente:</label>
					<input  class="form-control" type="number"placeholder="Ingrese el Rut del cliente sin guión"name="rutCliente">
				</p>
				<p>
					<label class="form-label">Día: </label>
					<input class="form-control" type="text" placeholder="Ingresa el día (lunes a domingo)" name="dia">
				</p>
				<p>
					<label class="form-label">Hora: </label>
					<input class="form-control" type="text"  placeholder="Ingresa la hora en formato HH:MM" name="hora">
				</p>
				<p>
					<label class="form-label">Lugar:</label>
					<input class="form-control" type="text" placeholder="Ingresa el lugar de la capacitación"name="lugar">
				</p>
				<p>
					<label class="form-label">Duración:</label>
					<input class="form-control" type="number" placeholder="Ingresa la duración en minutos" name="duracion">
				</p>
				<p>
					<label class="form-label">Cantidad de asistentes:</label>
					<input class="form-control" type="number" placeholder="Ingresa la cantidad de asistentes" name="cantidadAsistentes">
				</p>
				<div class="d-flex justify-content-center">
					<button class="btn"type="submit">Enviar</button>
				
				</div>
			
			</form>
		</section>
	<section class="verDatosCapacitacion">
		<h3>Mostrar los datos de la capacitacion ingresados: </h1>
		<form action="CrearCapacitacion" method="get">
			<div class="d-flex justify-content-center">
				<button class="btn" type="submit">Mostrar</button>
			</div>
		</form>
	</section>
	<div class="volver">
				<a href="Index.jsp">Volver a página de inicio</a>
			</div>
	
	</section>
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	

</body>
</html>