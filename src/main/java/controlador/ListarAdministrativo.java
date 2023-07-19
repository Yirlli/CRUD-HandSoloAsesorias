package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Administrativo;


import java.io.IOException;
import java.util.List;

import dao.AdministrativoDAO;

/**
 * Servlet implementation class ListarAdministrativo
 */
public class ListarAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAdministrativo() {
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
            AdministrativoDAO administrativoDAO = new AdministrativoDAO();
            List<Administrativo> listaAdministrativos = administrativoDAO.readAll();
            request.setAttribute("listaAdministrativos", listaAdministrativos);
            getServletContext().getRequestDispatcher("/ListarAdministrativo.jsp").forward(request, response);
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
