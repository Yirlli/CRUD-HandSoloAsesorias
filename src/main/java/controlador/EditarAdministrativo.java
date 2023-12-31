package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Administrativo;

import java.io.IOException;

import dao.AdministrativoDAO;

/**
 * Servlet implementation class EditarAdministrativo
 */
public class EditarAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarAdministrativo() {
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
	    	response.sendRedirect("EditarAdministrativo.jsp");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String area = request.getParameter("area");
        String experienciaPrevia = request.getParameter("experienciaPrevia");
        

        AdministrativoDAO administrativoDAO = new AdministrativoDAO();
        Administrativo administrativo = new Administrativo();

        if (administrativoDAO.update(administrativo)) {
            response.sendRedirect("Resultado.jsp?msg=La modificacion se ha realizado con exito"); 
        } else {
            response.sendRedirect("Resultado.jsp?msg=La modificacion no se ha realizado. Ingrese un Id valido"); 
        }
	}

}
