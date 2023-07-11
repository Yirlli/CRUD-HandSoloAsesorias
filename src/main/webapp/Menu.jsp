<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="CSS/Style.css"/>
<title>menu</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg ">
    <div class="container-fluid ">
      <a class="navbar-brand" href="Index.jsp"><p class="text-break">Hand Solo</p></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse " id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item ">
            <a class="nav-link active" aria-current="page" href="CrearCapacitacion">Crear Capacitacion</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="CrearUsuario">Crear Usuario</a>
          </li>
           <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="Contacto">Contacto</a>
          </li>
       
    
          <li class="nav-item dropdown ">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Cuenta
            </a>
            <ul class="dropdown-menu">
              <li><a class="dropdown-item" href="Login">Inicia Sesión</a></li>
              <li><a class="dropdown-item" href="CrearUsuario">Crear Usuario</a></li>
            </ul>
          </li>
           <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="CerrarSession">Cerrar Sesión</a>
          </li>
           
        </ul>
        
      </div>
    </div>
  </nav>

</body>
</html>