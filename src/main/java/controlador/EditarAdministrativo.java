package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String area = request.getParameter("area");
        String experienciaPrevia = request.getParameter("experienciaPrevia");
        

        AdministrativoDAO administrativoDAO = new AdministrativoDAO();
        Administrativo administrativo = new Administrativo();

        if (administrativoDAO.update(administrativo)) {
            response.sendRedirect("ListarUsuario"); // Redirigir a la página que muestra la lista de usuarios actualizada.
        } else {
            response.sendRedirect("error.jsp"); // Redirigir a una página de error si la actualización falla.
        }
	}

}
