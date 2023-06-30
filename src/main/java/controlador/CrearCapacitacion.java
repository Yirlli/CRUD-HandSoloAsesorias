package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Capacitacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class CrearCapacitacion
 */
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession misesion = request.getSession(false);
	    if (misesion == null || misesion.getAttribute("userLogin") == null) {
	    
	        response.sendRedirect("Login.jsp");
	    } else {
	    	List <Capacitacion> listaCapacitacion = new ArrayList<>();
	    	
			
			misesion.setAttribute("listaCapacitacion", listaCapacitacion);
			
			response.sendRedirect("CrearCapacitacion.jsp");
	    }

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 HttpSession session = request.getSession(false);
	      if (session == null || session.getAttribute("userLogin") == null) {
	            response.sendRedirect("Login.jsp");
	        } else {
	        	String identificador= request.getParameter("idCapacitacion");
	        	String rutCliente = request.getParameter("rutCliente");
	        	String dia  = request.getParameter("dia");
	        	String hora  = request.getParameter("hora");
	        	String lugar  = request.getParameter("lugar");
	        	String duracion  = request.getParameter("duracion");
	        	String cantidadAsistentes  = request.getParameter("cantidadAsistentes");
	        	List <Capacitacion> listaCapacitacion = new ArrayList<>();
	        	listaCapacitacion.add(new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes));
		

	        	session.setAttribute("listaCapacitacion", listaCapacitacion);
	        	response.sendRedirect("ListarCapacitaciones.jsp");
	        }
	}

}
