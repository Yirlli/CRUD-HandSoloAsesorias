package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.UsuarioDAO;

/**
 * Servlet implementation class EliminarUsuario
 */
public class EliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarUsuario() {
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
		int idUsuario = Integer.parseInt(request.getParameter("idCliente"));

		UsuarioDAO usuarioDAO = new UsuarioDAO();

        if (usuarioDAO .delete(idUsuario)) {
            response.sendRedirect("ListarProfesionales"); // Redirigir a la página que muestra la lista de profesionales actualizada.
        } else {
            response.sendRedirect("error.jsp"); // Redirigir a una página de error si la eliminación falla.
        }
	}

}
