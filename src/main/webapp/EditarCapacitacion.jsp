<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Editar Capacitacion</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	
	<section class="fondo d-flex justify-content-center aligm-items-center container-fluid ">
		<div class="w-75">
			<h2>Editar Capacitacion</h2>
			<form action="EditarCapacitacion" method="post">
				<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5  justify-content-center">
					<label for"id" class="form-label">Id:</label>
    				<input class="form-control w-50"type="text" name="id"  placeholder="Ingresa el Id del usuario a modificar"> 
       				<label class="form-label">Nombre de la capacitacion</label>
					<input class="form-control" type="text" placeholder="Ingresa el nombre de la capacitacion a realizar" name="nombre" id="nombre" required>
					<label class="form-label">Detalle </label>
					<input class="form-control" type="text"  placeholder="Ingresa el detalle de la capacitacion" name="detalle" id="detalle">
					<label class="form-label">Rut del Cliente:</label>
					<input  class="form-control" type="number"placeholder="Ingrese el Rut del cliente sin guion"name="rutCliente" id="rutCliente" required>
					<div class="form-text">El rut no debe superar los 9 dígitos.</div>
					<label class="form-label">Día: </label>
					<input class="form-control" type= placeholder="Ingresa el dia" name="dia" id="dia">
					<div class="form-text">Días: Lunes, Martes, Miercoles, Jueves, Viernes, Sabado y Domingo</div>
					<label class="form-label">Hora: </label>
					<input class="form-control" type="time"  placeholder="Ingresa la hora en formato HH:MM" name="hora" id="hora">
					<div class="form-text">Horario disponible de L-D: 09:00 AM a 21:00 PM</div>
					<label class="form-label">Lugar:</label>
					<input class="form-control" type="text" placeholder="Ingresa el lugar de la capacitacion"name="lugar" id="lugar" required>
					<div class="form-text">Solo Disponible en Chile</div>
					<label class="form-label">Duracion:</label>
					<input class="form-control" type="number" placeholder="Ingresa la duración en horas" name="duracion" id="duracion">
					<label class="form-label">Cantidad de asistentes:</label>
					<input class="form-control" type="number" placeholder="Ingresa la cantidad de asistentes" name="cantidadAsistentes" id="cantidadAsistentes" required>
					<div class="form-text">Máximo 1000 asistentes Mínimo 1</div>
					
					
        			<div class="d-flex mt-5 gap-3">
    					<button class="btn btn-success"> Actualizar</button>
    					<button class="btn btn-danger">Borrar</button>
    				</div>
        		</div>
    		</form>
    	</div>
	</section>
	<div class="volver mb-5 d-flex justify-content-center">
		<a href="Index.jsp">Volver a página de inicio</a>
	</div> 

</body>
</html>