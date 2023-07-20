package controlador;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;
import java.util.*;

import dao.AdministrativoDAO;
import dao.ClienteDAO;
import dao.ProfesionalDAO;
import dao.UsuarioDAO;/**
 * Servlet implementation class CrearUsuario
 */
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
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
	    	List<Usuario>listaUsuarios = usuarioDAO.readAll();
	    	
	    	ClienteDAO clienteDAO = new ClienteDAO();
	    	List<Cliente> listaClientes = clienteDAO.readAll();
	    	
	    	ProfesionalDAO profesionalDAO = new ProfesionalDAO();
	    	List<Profesional> listaProfesional = profesionalDAO.readAll();
	    	
	    	AdministrativoDAO administrativoDAO = new AdministrativoDAO();
	    	List<Administrativo> listaAdministrativos = administrativoDAO.readAll();
	    	
	    	if(listaUsuarios == null ||listaClientes == null|| listaProfesional == null ||listaAdministrativos == null) {
	    		listaUsuarios = new ArrayList<>();
	    		listaClientes= new ArrayList<>();
	    		listaProfesional= new ArrayList<>();
	    		listaAdministrativos = new ArrayList<>();
	    		
	    		
	    	}

	    	request.setAttribute("listaUsuarios", listaClientes);
	    	 request.setAttribute("listaClientes", listaClientes);
	         request.setAttribute("listaProfesional", listaProfesional);
	         request.setAttribute("listaAdministrativos", listaAdministrativos);

			
	    	 getServletContext().getRequestDispatcher("/CrearUsuario.jsp").forward(request, response);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		List<Usuario> listaUsuarios = (List<Usuario>) session.getAttribute("listaUsuarios");
		    
		   
		   
		
		//datos generales del usuario
	    Usuario usuario = new Usuario();
		usuario.setNombre( request.getParameter("nombreUsuario"));
	    String tipoUsuario = request.getParameter("tipoUsuario");
	    usuario.setTipo(tipoUsuario);
	    
	    
	    UsuarioDAO usuarioDAO = new UsuarioDAO();
	    usuarioDAO.create(usuario);
	    int idGenerado = usuario.getId();
	
	    
	    session.setAttribute("listaUsuarios", listaUsuarios);
    
	    
	    if (tipoUsuario.equals("Cliente")) {
	    
	    	List<Cliente> listaClientes = (List<Cliente>) session.getAttribute("listaClientes");
	    	 
	    	Cliente cliente = new Cliente();
		    cliente.setNombres(request.getParameter("nombreCliente"));
		    cliente.setApellidos( request.getParameter("apellidoCliente"));
		    cliente.setTelefono( request.getParameter("tlfCliente"));
		    cliente.setAfp(request.getParameter("afp"));
		    cliente.setSistemaSalud(request.getParameter("sistemaSalud"));
		    cliente.setDireccionCliente(request.getParameter("direccion"));
		    cliente.setComunaCliente(request.getParameter("comuna"));
		    String edadString = request.getParameter("edad");
		    cliente.setEdad(Integer.parseInt(edadString));
		    cliente.setDireccionCliente(request.getParameter("direccion"));
		    
		   
	        
		    ClienteDAO clienteDAO = new ClienteDAO();
		    clienteDAO.create(cliente);
		    int idGene = cliente.getCliente_id();
		    session.setAttribute("listaClientes", listaClientes);
		    
	    } else if (tipoUsuario.equals("Profesional")) {
		    List<Profesional> listaProfesional = (List<Profesional>) session.getAttribute("listaProfesional");
	    	Profesional profesional = new Profesional();
		    profesional.setTitulo (request.getParameter("titulo"));
		    String fechaIngresoString = request.getParameter("fechaIngreso");
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    Date fechaIngreso = null;
			try {
				fechaIngreso = sdf.parse(fechaIngresoString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    profesional.setFechaIngreso(new java.sql.Date(fechaIngreso.getTime()));
	        
	        ProfesionalDAO profesionalDAO = new ProfesionalDAO();
	        profesionalDAO.create(profesional);
	        int idG=profesional.getProfesional_id();
	        session.setAttribute("listaProfesional", listaProfesional);
	       
	        
	    } else if (tipoUsuario.equals("Administrativo")) {
	    	 List<Administrativo> listaAdministrativos = (List<Administrativo>) session.getAttribute("listaAdministrativos");
	    	Administrativo administrativo = new Administrativo();
		    administrativo.setArea(request.getParameter("area"));
		    administrativo.setExperienciaPrevia(request.getParameter("experienciaPrevia"));
	        
	        AdministrativoDAO administrativoDAO = new AdministrativoDAO();
	        administrativoDAO.create(administrativo);
	        int idGenera = administrativo.getAdministrativo_id();
	        session.setAttribute("listaAdministrativos", listaAdministrativos);
	    }
	  
	    response.sendRedirect("Resultado.jsp?msg=Usuario creado satisfactoriamente");
	   
	}
	 
}
