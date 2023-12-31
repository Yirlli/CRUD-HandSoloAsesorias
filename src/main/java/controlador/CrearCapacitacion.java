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
        	String rutClienteString = request.getParameter("rutCliente");
        	capacitacion.setRutCliente(Integer.parseInt(rutClienteString));
        	capacitacion.setDia(request.getParameter("dia"));
        	capacitacion.setHora(request.getParameter("hora"));
        	capacitacion.setLugar(request.getParameter("lugar"));
        	String duracionString = request.getParameter("duracion");
        	capacitacion.setDuracion(Integer.parseInt(duracionString));
        	String cantidadString= request.getParameter("cantidadAsistentes");
        	capacitacion.setCantidadAsistentes(Integer.parseInt(cantidadString));
        
            CapacitacionDAO capacitacionDAO = new CapacitacionDAO();
            capacitacionDAO.create(capacitacion);
            int idGenerado = capacitacion.getId();

            response.sendRedirect("Resultado.jsp?msg=La capacitacion se ha creado con exito");
	        }
	}

}
