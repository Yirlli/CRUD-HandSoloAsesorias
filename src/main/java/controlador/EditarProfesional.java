package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Profesional;

import java.io.IOException;
import java.time.LocalDate;

import dao.ProfesionalDAO;

/**
 * Servlet implementation class EditarProfesional
 */
public class EditarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProfesional() {
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
	
        String titulo = request.getParameter("titulo");
        String fechaIngresoString = request.getParameter("fechaIngreso");
        LocalDate fechaIngreso = LocalDate.parse(fechaIngresoString);

        ProfesionalDAO profesionalDAO = new ProfesionalDAO();
        Profesional profesional = new Profesional();

        if (profesionalDAO.update(profesional)) {
            response.sendRedirect("ListarUsuario"); // Redirigir a la página que muestra la lista de usuarios actualizada.
        } else {
            response.sendRedirect("error.jsp"); // Redirigir a una página de error si la actualización falla.
        }
	}

}
