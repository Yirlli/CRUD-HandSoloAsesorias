package interfaces;
import java.util.List;

import modelo.Capacitacion;

public interface Crud <Clase >{
	
	//metdos CRUD para implementar en los DAOS, genericos p
	public  List <Object>readAll() ;
	
	public void  create(Clase c);
	
	public boolean delete(Object key);
	
	public boolean update(Clase c);
	
	public Object read(Object key);
	

}
