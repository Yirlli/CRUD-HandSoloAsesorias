package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import conexion.ConexionBD;
import interfaces.Crud;
import modelo.Capacitacion;
import modelo.Usuario;

public class UsuarioDAO implements Crud<Usuario>{
	//se agrega los atributos constantes con las querys a utilizar segun los datos y nombre de tablas que se dispongan
		private static final String SQL_INSERT = "INSERT INTO Usuarios (nombre, tipo) VALUES(?,?)";
		private static final String SQL_DELETE ="DELETE FROM Usuarios where id =?";
		private static final String SQL_UPDATE ="UPDATE Usuarios SET nombre=?, tipo=? WHERE id=?";
		private static final String SQL_READ ="SELECT * FROM Usuarios WHERE id=?";
		private static final String SQL_READALL ="SELECT * FROM Usuarios";
		
		// se especifica la base de datos a la cual se va a conectar
		
		private static final ConexionBD conexion = ConexionBD.estatus();
		
		
		
		//se implementan los metodos CRUD de la interfaz, cambiando a la clase que se ocupara

	@Override
	public List readAll() {
		PreparedStatement ps;
		ResultSet res;
		List<Usuario> listaUsuarios = new ArrayList<>();
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READALL);
			res= ps.executeQuery();
			while(res.next()) {
				listaUsuarios.add(new Usuario(res.getInt(1), res.getString(2),res.getString(3)));
			}
			
		}catch(SQLException e) {
        	Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally {
        	conexion.cerrarConexion();
        }
		return listaUsuarios;
	}

	@Override
	public void create(Usuario c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		 ResultSet generatedKeys;
		try{
		ps = conexion.getConexion().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getNombre());
		ps.setString(2, c.getTipo());
		ps.executeUpdate();
		
		 generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) {
            int idGenerado = generatedKeys.getInt(1);
            c.setId(idGenerado);
        }
       }catch(SQLException e) {
       	Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null, e);
       }finally {
       	conexion.cerrarConexion();
       }
		
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_DELETE);
			ps.setString(1, key.toString());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
		}catch (SQLException e){
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		
		return false;
		
	}

	@Override
	public boolean update(Usuario c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_UPDATE);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getTipo());
			ps.setInt(3, c.getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
			
		}catch(SQLException e) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null, e);
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
		Usuario usuarios = null;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			
			res= ps.executeQuery();
			while(res.next()) {
				usuarios = new Usuario(res.getInt(1),res.getString(2), res.getString(3));
			}
			return usuarios;
		}catch(SQLException e) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return usuarios;
	}

}
