package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Capacitacion;
import modelo.Capacitacion;
import modelo.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import interfaces.Crud;
import dao.CapacitacionDAO;


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

		  HttpSession session = request.getSession(false);
	        if (session == null || session.getAttribute("userLogin") == null) {
	            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	        } else {
	            CapacitacionDAO capacitacionDAO = new CapacitacionDAO();
	            List<Capacitacion> listaCapacitaciones = capacitacionDAO.readAll();
	            if (listaCapacitaciones == null) {
	                listaCapacitaciones = new ArrayList<>();
	            }
	            request.setAttribute("listaCapacitaciones", listaCapacitaciones);
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
            response.sendRedirect("Login.jsp");
        } else {
           
        	Capacitacion capacitacion = new Capacitacion();
        	capacitacion.setNombre(request.getParameter("nombre"));
        	capacitacion.setDetalle(request.getParameter("detalle"));
        	capacitacion.setNombre(request.getParameter("rutCliente"));
        	capacitacion.setDetalle(request.getParameter("dia"));
        	capacitacion.setNombre(request.getParameter("hora"));
        	capacitacion.setDetalle(request.getParameter("lugar"));
        	capacitacion.setNombre(request.getParameter("duracion"));
        	capacitacion.setDetalle(request.getParameter("cantidadAsistentes"));
        
            CapacitacionDAO capacitacionDAO = new CapacitacionDAO();
            capacitacionDAO.create(capacitacion);
            int idGenerado = capacitacion.getId();

            response.sendRedirect("CapacitacionSatisfactorio.jsp");
	        }
	}

}
