<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Editar Cliente</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	
	<section class="fondo d-flex justify-content-center aligm-items-center container-fluid ">
		<div class="w-75">
			<h2>Editar Usuario Cliente</h2>
			<form action="EditarCliente" method="post">
				<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5 align-items-center justify-content-center">
					<label for"id" class="form-label">Id:</label>
    				<input class="form-control w-50"type="text" name="id"  placeholder="Ingresa el Id del usuario a modificar"> 
       				<label for="nombre" class="form-label">Nombres:</label>
        			<input type="text" name="nombres" class="form-control w-50" placeholder="Ingresa los nombres"/> 
        			<label for="tipo" class="form-label">Apellidos:</label>
        			<input class="form-control w-50"type="text" name="apellidos"  placeholder="Ingresa los apellidos"> 
        			<label for="nombre" class="form-label">Telefono:</label>
        			<input type="text" name="tlf" class="form-control w-50" placeholder="Ingresa el numero de TLF (+56)"/> 
        			<label for="tipo" class="form-label">AFP:</label>
        			<input class="form-control w-50"type="text" name="afp"  placeholder="Ingresa los apellidos"> 
        			<label class="form-label" for="sistemaSalud">Sistema de salud:</label>
					<select id="tipoUsuario" name="sistemaSalud" class="form-control" required>	
						<option value="despliegue" selected></option>
						<option value="Fonasa">Opcion 1 Fonasa</option>
						<option value="Isapre">Opcion 2 Isapre</option>
					</select>
					<label for="direccion" class="form-label">Direccion:</label>
        			<input type="text" name="direccion" class="form-control w-50" placeholder="Ingresa la direccion"/> 
        			<label for="comuna" class="form-label">Comuna:</label>
        			<input class="form-control w-50"type="text" name="comuna"  placeholder="Ingresa la comuna"> 
        			<label for="edad" class="form-label">Edad:</label>
        			<input type="number" name="tlf" class="form-control w-50" placeholder="Ingresa la edad"/> 
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