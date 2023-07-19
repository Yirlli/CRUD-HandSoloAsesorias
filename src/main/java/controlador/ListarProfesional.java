package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Profesional;

import java.io.IOException;
import java.util.List;
import interfaces.Crud;
import dao.ProfesionalDAO;

/**
 * Servlet implementation class ListarProfesional
 */
public class ListarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarProfesional() {
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
            ProfesionalDAO profesionalDAO = new ProfesionalDAO();
            List<Profesional> listaProfesional = profesionalDAO.readAll();
            request.setAttribute("listaProfesional", listaProfesional);
            getServletContext().getRequestDispatcher("/ListaProfesional.jsp").forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
