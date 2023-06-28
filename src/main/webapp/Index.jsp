<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>Inicio Hand Solo Asesorias</title>
</head>
<body>
	<header>
 		<jsp:include page="Menu.jsp" />
	</header>
	<main class="fondoMain">
	<section class="fondoMain d-flex">
		<section>
			<h1>Asesorias y Capacitaciones Hand Solo</h1>
		</section>
		
	</section>
	<section class="infoEmpresa d-flex flex-column">
		<h3>Sobre nosotros
		</h3>
		<p>Hand Solo es una empresa que brinda asesorías y capacitaciones a empresas en cuanto a prevención de riesgos laborales ofrecer una solución completa en prevención de riesgos para las
empresas a un costo razonable, cumpliendo estrictamente todos los procesos necesarios para
dar cumplimiento a la normativa vigente, mejorando los ambientes de trabajo, la
productividad, contribuyendo a un ahorro económico.</p>
	</section>
	<section class="opciones d-flex flex-column">
		<h2>Elige la opción de lo que deseas realizar</h2>
	
			<button class="btn btnInicio"type="submit"><a href="CrearCapacitacion.jsp">Crear capacitación</a> </button>
		
		
		<button class="btn btnInicio"><a href="Contacto.jsp">Solicitar contacto</a></button>
	</section>


</main>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>