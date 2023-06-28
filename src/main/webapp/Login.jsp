<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Inicio Sesión</title>
</head>
<body>
<section class="fondo d-flex flex-column ">
		<section class="formCapacitacion d-fex align-center"> 
			<h1 class="tituLogin">Inicia sesión</h1>
			<form action="Login" method="POST">
				<p>
					<label class="form-label">Usuario:</label>
					<input class="form-control" placeholder="Ingresa el usuario" type="text" name="userLogin">
				</p>
				<p>
					<label class="form-label">Contraseña:</label>
					<input  class="form-control" type="password"placeholder="Ingrese su contraseña"name="contraseniaLogin">
				</p>
				
				<p>
				<div class="flex">
					<button class="btn"type="submit">Enviar</button>
					<button class="btn"type="reset">Borrar</button>
				</div>
			
			</form>
			
			<div class="volver">
				<a href="Index.jsp">Volver a página de inicio</a>
			</div>
		</section>
		
		

</body>
</html>