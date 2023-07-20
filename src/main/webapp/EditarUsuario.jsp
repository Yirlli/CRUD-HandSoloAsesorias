<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Editar Usuario</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	
	<section class="fondo d-flex justify-content-center aligm-items-center container-fluid vh-100">
		<div class="w-75">
			<h2 >Editar Usuario</h2>
			<form action="EditarUsuario" method="post">
				<div class="d-flex flex-column bg-white fondoUser rounded-1 p-5 align-items-center justify-content-center">
    				<label for="id" class="form-label">Id:</label>
        			<input class="form-control w-50"type="text" name="id"  placeholder="Ingresa el Id del usuario a modificar"> 
       				<label for="nombre" class="form-label">Nombre:</label>
        			<input type="text" name="nombre" class="form-control w-50" placeholder="Ingrese el nombre a modificar" /> 
        			<label for="tipo" class="form-label">Tipo de usuario:</label>
        			<select id="tipo" name="tipo" class="form-control w-50">
						<option value="Administrativo">Administrativo</option>
						<option value="Cliente">Cliente</option>
						<option value="Profesional">Profesional</option>
					</select>
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