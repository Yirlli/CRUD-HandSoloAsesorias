<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Inicio Sesi�n</title>
</head>
<body>
<section class="fondo d-flex flex-column p-5 vh-100 align-items-center">
		<section class="formCapacitacion d-fex align-center "> 
			<h1 class="tituLogin">Inicia sesi�n</h1>
			<form action="Login" method="POST" >
				<div class=" d-flex flex-column align-items-center"> 
					<div>
						<label class="form-label">Usuario:</label>
						<input class="form-control" placeholder="Ingresa el usuario" type="text" name="userLogin">
					</div>
					<div>
						<label class="form-label">Contrase�a:</label>
						<input  class="form-control" type="password"placeholder="Ingrese su contrase�a"name="contraseniaLogin">
					</div>
				
				</div>
				<div class="d-flex justify-content-center p-2 botones">
					<button class="btn vw-17"type="submit" id="btnlogin">Enviar</button>
					<button class="btn vw-17"type="reset">Borrar</button>
				</div>
			
			</form>
			
			
			
			<div class="volver d-flex justify-content-center">
				<a href="Index.jsp">Volver a p�gina de inicio</a>
			</div>
		</section>
		
		

</body>
</html>