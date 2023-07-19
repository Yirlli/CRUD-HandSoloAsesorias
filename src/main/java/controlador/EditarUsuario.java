package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import modelo.Usuario;
import dao.UsuarioDAO;

/**
 * Servlet implementation class EditarUsuario
 */
public class EditarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarUsuario() {
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

        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();

        if (usuarioDAO.update(usuario)) {
            response.sendRedirect("ListarUsuario"); // Redirigir a la página que muestra la lista de usuarios actualizada.
        } else {
            response.sendRedirect("error.jsp"); // Redirigir a una página de error si la actualización falla.
        }
	}

}
