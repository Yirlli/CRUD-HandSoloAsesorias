package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;

import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;
import java.util.*;/**
 * Servlet implementation class CrearUsuario
 */
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
	    if (session == null || session.getAttribute("userLogin") == null) {
	    	response.sendRedirect("Login.jsp");
	    
	    } else {
	    	List<Usuario> listaUsuarios = (List<Usuario>) session.getAttribute("listaUsuarios");
	    	 request.setAttribute("listaUsuarios", listaUsuarios);

			
	    	 getServletContext().getRequestDispatcher("/CrearUsuario.jsp").forward(request, response);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
	    List<Usuario> listaUsuarios = (List<Usuario>) session.getAttribute("listaUsuarios");
	    
	    if (listaUsuarios == null) {

	        listaUsuarios = new ArrayList<>();
	    }
		
		//datos generales del usuario
		String user = request.getParameter("nombreUsuario");
	    String tipoUsuario = request.getParameter("tipoUsuario");
	    String fechaNacimientoString = request.getParameter("fechaNacimiento");
	    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);
	    String runString = request.getParameter("run");
	    Integer run = Integer.parseInt(runString);
	    

	    
	    if (tipoUsuario.equals("Cliente")) {
	    
		    
		    String nombres = request.getParameter("nombreCliente");
		    String apellidos = request.getParameter("apellidoCliente");
		    String telefonoString = request.getParameter("tlfCliente");
		    Integer telefonoCliente = Integer.parseInt(telefonoString);
		    String afp = request.getParameter("afp");
		    String sistemaSaludString= request.getParameter("sistemaSalud");
		    Integer sistemaSalud= Integer.parseInt(sistemaSaludString);
		    String domicilioCliente = request.getParameter("direccion");
		    String comunaCliente = request.getParameter("comuna");
		    String edadString = request.getParameter("edad");
		    Integer edad =  Integer.parseInt(edadString);
		    String direccionCliente =request.getParameter("direccion");
		    
		    Cliente cliente = new Cliente(user, fechaNacimiento, run, nombres, apellidos,telefonoCliente, afp, sistemaSalud, direccionCliente, comunaCliente, edad);
		    listaUsuarios.add(cliente);
		    
	    } else if (tipoUsuario.equals("Profesional")) {
	    	
		    String titulo =request.getParameter("titulo");
		    String fechaIngresoString = request.getParameter("fechaIngreso");
		    LocalDate fechaIngreso = LocalDate.parse(fechaIngresoString);
		    
	        Profesional profesional = new Profesional(user, fechaNacimiento, run, titulo, fechaIngreso);
	        listaUsuarios.add(profesional);
	        
	    } else if (tipoUsuario.equals("Administrativo")) {

		    String area = request.getParameter("area");
		    String experienciaPrevia = request.getParameter("experienciaPrevia");
	        Administrativo administrativo = new Administrativo(user, fechaNacimiento, run, area, experienciaPrevia);
	        listaUsuarios.add(administrativo);
	 
	    }
	    session.setAttribute("listaUsuarios", listaUsuarios);
	    response.sendRedirect("ListarUsuario");
	   
	}
	 
}
