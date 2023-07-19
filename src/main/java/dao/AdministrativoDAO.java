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
import modelo.Administrativo;
import modelo.Usuario;
public class AdministrativoDAO implements Crud<Administrativo> {
	//se agrega los atributos constantes con las querys a utilizar segun los datos y nombre de tablas que se dispongan
			private static final String SQL_INSERT = "INSERT INTO Administrativo (area, experiencia_previa) VALUES(?,?)";
			private static final String SQL_DELETE ="DELETE FROM Administrativo where id =?";
			private static final String SQL_UPDATE ="UPDATE Administrativo SET area=?, experiencia_previa=? WHERE id=?";
			private static final String SQL_READ ="SELECT * FROM Administrativo WHERE id=?";
			private static final String SQL_READALL ="SELECT * FROM Administrativo";
			
			// se especifica la base de datos a la cual se va a conectar
			
			private static final ConexionBD conexion = ConexionBD.estatus();
			
			
			
			//se implementan los metodos CRUD de la interfaz, cambiando a la clase que se ocupara

	@Override
	public List readAll() {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		ResultSet res;
		List<Administrativo> listaAdministrativos = new ArrayList<>();
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READALL);
			res= ps.executeQuery();
			while(res.next()) {
				listaAdministrativos.add(new Administrativo(res.getInt(1), res.getString(2),res.getString(3)));
			}
			
		}catch(SQLException e) {
        	Logger.getLogger(AdministrativoDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally {
        	conexion.cerrarConexion();
        }
		return listaAdministrativos;
	}

	@Override
	public void create(Administrativo c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		 ResultSet generatedKeys;
		try{
		ps = conexion.getConexion().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getArea());
		ps.setString(2, c.getExperienciaPrevia());
		ps.executeUpdate();
		
		 generatedKeys = ps.getGeneratedKeys();
       if (generatedKeys.next()) {
           int idGenera = generatedKeys.getInt(1);
           c.setId(idGenera);
       }
      }catch(SQLException e) {
      	Logger.getLogger(AdministrativoDAO.class.getName()).log(Level.SEVERE,null, e);
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
			Logger.getLogger(AdministrativoDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		
		return false;
	}

	@Override
	public boolean update(Administrativo c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_UPDATE);
			ps.setString(1, c.getArea());
			ps.setString(2, c.getExperienciaPrevia());
			ps.setInt(3, c.getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
			
		}catch(SQLException e) {
			Logger.getLogger(AdministrativoDAO.class.getName()).log(Level.SEVERE,null, e);
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
		Administrativo administrativo = null;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			
			res= ps.executeQuery();
			while(res.next()) {
				administrativo = new Administrativo(res.getInt(1),res.getString(2), res.getString(3));
			}
			return administrativo;
		}catch(SQLException e) {
			Logger.getLogger(AdministrativoDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return administrativo;
	}
	

}
