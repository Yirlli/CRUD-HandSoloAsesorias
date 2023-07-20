package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import dao.ProfesionalDAO;
/**
 * Servlet implementation class EliminarProfesional
 */
public class EliminarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarProfesional() {
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
	    	response.sendRedirect("EliminarProfesional.jsp");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int idProfesional = Integer.parseInt(request.getParameter("id"));

        ProfesionalDAO profesionalDAO = new ProfesionalDAO();

        if (profesionalDAO.delete("idProfesional")) {
        	 response.sendRedirect("Resultado.jsp?msg=La eliminacion se ha realizado con exito");
        } else {
        	response.sendRedirect("Resultado.jsp?msg=La eliminacion no se ha realizado. Ingrese un Id valido");
        }
	}

}
