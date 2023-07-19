package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import conexion.ConexionBD;
import interfaces.Crud;
import modelo.Cliente;
import modelo.Usuario;

public class ClienteDAO implements Crud<Cliente>{
	//se agrega los atributos constantes con las querys a utilizar segun los datos y nombre de tablas que se dispongan
			private static final String SQL_INSERT = "INSERT INTO Cliente (nombres, apellidos, telefono, afp, sistema_salud, direccion_cliente, comuna_cliente,edad) VALUES(?,?,?,?,?,?,?,?)";
			private static final String SQL_DELETE ="DELETE FROM Cliente where cliente_id =?";
			private static final String SQL_UPDATE ="UPDATE Cliente SET nombres=?, apellidos=?, telefono=?, afp=?, sistema_salud=?,direccion_cliente=?, comuna_cliente=?, edad=?,WHERE id=?";
			private static final String SQL_READ ="SELECT * FROM Cliente WHERE cliente_id=?";
			private static final String SQL_READALL ="SELECT * FROM Cliente";
			
			// se especifica la base de datos a la cual se va a conectar
			
			private static final ConexionBD conexion = ConexionBD.estatus();
			
			
			
			//se implementan los metodos CRUD de la interfaz, cambiando a la clase que se ocupara

	@Override
	public List readAll() {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		ResultSet res;
		List<Cliente> listaClientes = new ArrayList<>();
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READALL);
			res= ps.executeQuery();
			while(res.next()) {
				listaClientes.add(new Cliente(res.getInt(1), res.getString(2),res.getString(3),res.getString(4), res.getString(5), res.getInt(6), res.getString(7),res.getString(8), res.getInt(9)));
			}
			
		}catch(SQLException e) {
        	Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally {
        	conexion.cerrarConexion();
        }
		return listaClientes;
	}

	@Override
	public void create(Cliente c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		 ResultSet generatedKeys;
		try{
		ps = conexion.getConexion().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getNombres());
		ps.setString(2, c.getApellidos());
		ps.setString(3, c.getTelefono());
		ps.setString(4, c.getAfp());
		ps.setInt(5, c.getSistemaSalud());
		ps.setString(6, c.getDireccionCliente());
		ps.setString(7, c.getComunaCliente());
		ps.setInt(8, c.getEdad());
		
		ps.executeUpdate();
		
		 generatedKeys = ps.getGeneratedKeys();
       if (generatedKeys.next()) {
           int idGene = generatedKeys.getInt(1);
           c.setId(idGene);
       }
      }catch(SQLException e) {
      	Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null, e);
      }finally {
      	conexion.cerrarConexion();
      }
	}

	@Override
	public boolean delete(Object key) {
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_DELETE);
			ps.setString(1, key.toString());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
		}catch (SQLException e){
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return false;
	}

	@Override
	public boolean update(Cliente c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_UPDATE);
			ps.setString(1, c.getNombres());
			ps.setString(2, c.getApellidos());
			ps.setString(3, c.getTelefono());
			ps.setString(4, c.getAfp());
			ps.setInt(5, c.getSistemaSalud());
			ps.setString(6, c.getDireccionCliente());
			ps.setString(7, c.getComunaCliente());
			ps.setInt(8, c.getEdad());
			ps.setInt(9, c.getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
			
		}catch(SQLException e) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return false;
	}

	@Override
	public Object read(Object key) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		ResultSet res;
		Cliente clientes = null;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			
			res= ps.executeQuery();
			while(res.next()) {
				clientes = new Cliente(res.getInt(1), res.getString(2),res.getString(3),res.getString(4), res.getString(5), res.getInt(6), res.getString(7),res.getString(8), res.getInt(9));
			}
			return clientes;
		}catch(SQLException e) {
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return clientes;
		
	}

}
