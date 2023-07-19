package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Capacitacion;
import modelo.Capacitacion;

import java.io.IOException;
import java.util.*;
import implementacion.ImpCapacitacion;
import interfaces.Crud;
import dao.CapacitacionDAO;

/**
 * Servlet implementation class ListarCapacitaciones
 */
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
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
            List<Capacitacion> listaCapacitacion = capacitacionDAO.readAll();
            request.setAttribute("listaCapacitacion", listaCapacitacion);
            getServletContext().getRequestDispatcher("/ListarCapacitaciones.jsp").forward(request, response);
        }
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	    	 
		
	

}
}