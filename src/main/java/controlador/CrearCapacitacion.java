package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Capacitacion;
import modelo.Usuario;

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
	    
	    	getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	    } else {
	    	List<Capacitacion> listaCapacitacion = (List<Capacitacion>) misesion.getAttribute("listaCapacitacion");
	    	 request.setAttribute("listaCapacitacion", listaCapacitacion);
	    	 getServletContext().getRequestDispatcher("/CrearCapacitacion.jsp").forward(request, response);
	    	
		
	    }

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 HttpSession session = request.getSession(false);
	      if (session == null || session.getAttribute("userLogin") == null) {
	            response.sendRedirect("../vistas/Login.jsp");
	        } else {
	        	String identificadorString = request.getParameter("idCapacitacion");
	        	Integer identificador = Integer.parseInt(identificadorString);
	        	String rutClienteString = request.getParameter("rutCliente");
	        	Integer rutCliente = Integer.parseInt(rutClienteString);
	        	String dia  = request.getParameter("dia");
	        	String hora  = request.getParameter("hora");
	        	String lugar  = request.getParameter("lugar");
	        	String duracionString = request.getParameter("duracion");
	        	Integer duracion = Integer.parseInt(duracionString);
	        	String cantidadAsistentesString = request.getParameter("cantidadAsistentes");
	        	Integer cantidadAsistentes = Integer.parseInt(cantidadAsistentesString);
	        	
	        	Capacitacion capacitacion = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
	        	List<Capacitacion> listaCapacitacion = (List<Capacitacion>) session.getAttribute("listaCapacitacion");
	        	 if (listaCapacitacion == null) {
	                 listaCapacitacion = new ArrayList<>();
	             }
	        	 listaCapacitacion.add(capacitacion);

	             
	             session.setAttribute("listaCapacitacion", listaCapacitacion);

	             getServletContext().getRequestDispatcher("/ListarCapacitaciones.jsp").forward(request, response);
	        }
	}

}
