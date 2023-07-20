package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Cliente;

import java.io.IOException;

import dao.ClienteDAO;

/**
 * Servlet implementation class EditarCliente
 */
public class EditarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCliente() {
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
		int id = Integer.parseInt(request.getParameter("id"));
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String telefono = request.getParameter("telefono");
        String afp = request.getParameter("afp");
        String sistemaSalud = request.getParameter("sistemaSalud");
        String direccionCliente = request.getParameter("direccionCliente");
        String comunaCliente = request.getParameter("comunaClientes");
        String edadString = request.getParameter("edad");
        int edad = Integer.parseInt(edadString);
        

        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = new Cliente(id, nombres, apellidos, telefono ,afp, sistemaSalud, direccionCliente, comunaCliente, edad);

        if (clienteDAO.update(cliente)) {
            response.sendRedirect("Resultado.jsp?msg=La modificacion se ha realizado con exito"); 
        } else {
            response.sendRedirect("Resultado.jsp?msg=La modificacion no se ha realizado. Ingrese un Id valido"); 
        }
	}

}
