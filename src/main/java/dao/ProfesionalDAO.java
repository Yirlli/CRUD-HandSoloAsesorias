package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import conexion.ConexionBD;
import interfaces.Crud;
import modelo.Profesional;


public class ProfesionalDAO implements Crud <Profesional>{
	//se agrega los atributos constantes con las querys a utilizar segun los datos y nombre de tablas que se dispongan
			private static final String SQL_INSERT = "INSERT INTO Profesional (titulo, fecha_ingreso) VALUES(?,?)";
			private static final String SQL_DELETE ="DELETE FROM Profesional where profesional_id =?";
			private static final String SQL_UPDATE ="UPDATE Profesional SET titulo=?, fecha_ingreso=? WHERE id=?";
			private static final String SQL_READ ="SELECT * FROM Profesional WHERE profesional_id=?";
			private static final String SQL_READALL ="SELECT * FROM Profesional";
			
			// se especifica la base de datos a la cual se va a conectar
			
			private static final ConexionBD conexion = ConexionBD.estatus();
			
			
			
			//se implementan los metodos CRUD de la interfaz, cambiando a la clase que se ocupara

	@Override
	public  List readAll() {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		ResultSet res;
		List<Profesional> listaProfesional = new ArrayList<>();
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READALL);
			res= ps.executeQuery();
			while(res.next()) {
				listaProfesional .add(new Profesional(res.getInt(1), res.getString(2),res.getString(3)));
			}
			
		}catch(SQLException e) {
        	Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE,null, e);
        }finally {
        	conexion.cerrarConexion();
        }
		return listaProfesional ;
	}

	@Override
	public void create(Profesional c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		 ResultSet generatedKeys;
		try{
		ps = conexion.getConexion().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getTitulo());
		Date fechaIngreso = c.getFechaIngreso();
        ps.setDate(2, fechaIngreso);
		ps.executeUpdate();
		
		 generatedKeys = ps.getGeneratedKeys();
       if (generatedKeys.next()) {
           int idG= generatedKeys.getInt(1);
           c.setId(idG);
       }
      }catch(SQLException e) {
      	Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE,null, e);
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
			Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return false;
	}

	@Override
	public boolean update(Profesional c) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_UPDATE);
			ps.setString(1, c.getTitulo());
			//convertimos la fecha de ingreso en un dato que pueda soportar sql
			Date fechaIngreso = c.getFechaIngreso();
	        ps.setDate(2, fechaIngreso);
			ps.setInt(3, c.getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
			
		}catch(SQLException e) {
			Logger.getLogger(ProfesionalDAO.class.getName()).log(Level.SEVERE,null, e);
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
		Profesional profesional = null;
		
		try {
			ps = conexion.getConexion().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			
			res= ps.executeQuery();
			while(res.next()) {
				Date fechaIngreso = res.getDate(3);
				profesional = new Profesional(res.getInt(1),res.getString(2), fechaIngreso);
			}
			return profesional;
		}catch(SQLException e) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null, e);
		}finally {
			conexion.cerrarConexion();
		}
		return profesional;
	}

}
