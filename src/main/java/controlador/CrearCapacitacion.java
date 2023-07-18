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

import interfaces.Crud;
import dao.CapacitacionDAO;
import dto.CapacitacionDTO;


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
	            List<CapacitacionDTO> listaCapacitaciones = capacitacionDAO.readAll();
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
           /* String identificadorString = request.getParameter("idCapacitacion");
            Integer identificador = Integer.parseInt(identificadorString);
            String rutClienteString = request.getParameter("rutCliente");
            Integer rutCliente = Integer.parseInt(rutClienteString);
            String dia = request.getParameter("dia");
            String hora = request.getParameter("hora");
            String lugar = request.getParameter("lugar");
            String duracionString = request.getParameter("duracion");
            Integer duracion = Integer.parseInt(duracionString);
            String cantidadAsistentesString = request.getParameter("cantidadAsistentes");
            Integer cantidadAsistentes = Integer.parseInt(cantidadAsistentesString);*/
        	
        	String nombre=request.getParameter("nombre");
        	String detalle = request.getParameter("detalle");
        	String idString = request.getParameter("id");
            Integer id = Integer.parseInt(idString);

            CapacitacionDTO capacitacion = new CapacitacionDTO(id,nombre, detalle);
            CapacitacionDAO capacitacionDAO = new CapacitacionDAO();
            capacitacionDAO.create(capacitacion);

            response.sendRedirect("CapacitacionSatisfactorio.jsp");
	        }
	}

}
