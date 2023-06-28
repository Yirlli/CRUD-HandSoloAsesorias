<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title> Formuluario de Contacto</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	<section class="fondo d-flex flex-column ">
		<section class="formCapacitacion d-fex align-center fondo">
			<h1 class="tituloContacto">Contacto</h1>
			<form action="Contacto" method="POST" class="d-flex flex-column">
				<div>
					<label class="form-label">Nombre:</label>
					<input  class="form-control" placeholder="Nombre de contacto"  type="text" name="nombreConsulta">
				</div>	
				<div>
					<label class="form-label">Apellido:</label>
					<input  class="form-control" placeholder="Apellido de contacto" type="text" name="apellidoConsulta">
				</div>
				<div>
					<label class="form-label">Tel�fono: </label>
					<input class="form-control" placeholder="(+569)" type="number" name="tlfConsulta">
				</div>
				<div>
					<label class="form-label">Email: </label>
					<input class="form-control" placeholder="micorreo@gmail.com" type="email" name="emailConsulta">
				</div>
				<div>
					<label class="form-label">Mensaje: </label>
					<textarea class="form-control" placeholder="ingrese su texto aqui "type="text" name="mensaje"></textarea>
				</div>
				<button class="btn" type="submit">Enviar</button>
			</form>
			<div class="volver">
				<a href="Index.jsp">Volver a p�gina de inicio</a>
			</div>
		
		</section>
	</section>

</body>
</html>