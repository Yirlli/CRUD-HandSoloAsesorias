package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Capacitacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;
import dao.UsuarioDAO;
/**
 * Servlet implementation class ListarUsuario
 */
public class ListarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuario() {
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
	    	UsuarioDAO usuarioDAO = new UsuarioDAO();
	    	List<Usuario> listaUsuarios = usuarioDAO.readAll();
	        request.setAttribute("listaUsuarios", listaUsuarios);
	        getServletContext().getRequestDispatcher("/ListarUsuario.jsp").forward(request, response);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}
