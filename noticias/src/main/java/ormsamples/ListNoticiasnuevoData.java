/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListNoticiasnuevoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Noticia...");
		base_de_datos.Noticia[] base_de_datosNoticias = base_de_datos.NoticiaDAO.listNoticiaByQuery(null, null);
		int length = Math.min(base_de_datosNoticias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosNoticias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Logueado...");
		base_de_datos.Logueado[] base_de_datosLogueados = base_de_datos.LogueadoDAO.listLogueadoByQuery(null, null);
		length = Math.min(base_de_datosLogueados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosLogueados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Registrado...");
		base_de_datos.Registrado[] base_de_datosRegistrados = base_de_datos.RegistradoDAO.listRegistradoByQuery(null, null);
		length = Math.min(base_de_datosRegistrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosRegistrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		base_de_datos.Administrador[] base_de_datosAdministradors = base_de_datos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(base_de_datosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actividad...");
		base_de_datos.Actividad[] base_de_datosActividads = base_de_datos.ActividadDAO.listActividadByQuery(null, null);
		length = Math.min(base_de_datosActividads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(base_de_datosActividads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Noticia by Criteria...");
		base_de_datos.NoticiaCriteria lbase_de_datosNoticiaCriteria = new base_de_datos.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosNoticiaCriteria.ID.eq();
		lbase_de_datosNoticiaCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Noticia[] base_de_datosNoticias = lbase_de_datosNoticiaCriteria.listNoticia();
		int length =base_de_datosNoticias== null ? 0 : Math.min(base_de_datosNoticias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosNoticias[i]);
		}
		System.out.println(length + " Noticia record(s) retrieved."); 
		
		System.out.println("Listing Logueado by Criteria...");
		base_de_datos.LogueadoCriteria lbase_de_datosLogueadoCriteria = new base_de_datos.LogueadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosLogueadoCriteria.ID.eq();
		lbase_de_datosLogueadoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Logueado[] base_de_datosLogueados = lbase_de_datosLogueadoCriteria.listLogueado();
		length =base_de_datosLogueados== null ? 0 : Math.min(base_de_datosLogueados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosLogueados[i]);
		}
		System.out.println(length + " Logueado record(s) retrieved."); 
		
		System.out.println("Listing Registrado by Criteria...");
		base_de_datos.RegistradoCriteria lbase_de_datosRegistradoCriteria = new base_de_datos.RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosRegistradoCriteria.ID.eq();
		lbase_de_datosRegistradoCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Registrado[] base_de_datosRegistrados = lbase_de_datosRegistradoCriteria.listRegistrado();
		length =base_de_datosRegistrados== null ? 0 : Math.min(base_de_datosRegistrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosRegistrados[i]);
		}
		System.out.println(length + " Registrado record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		base_de_datos.AdministradorCriteria lbase_de_datosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosAdministradorCriteria.ID.eq();
		lbase_de_datosAdministradorCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Administrador[] base_de_datosAdministradors = lbase_de_datosAdministradorCriteria.listAdministrador();
		length =base_de_datosAdministradors== null ? 0 : Math.min(base_de_datosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Actividad by Criteria...");
		base_de_datos.ActividadCriteria lbase_de_datosActividadCriteria = new base_de_datos.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbase_de_datosActividadCriteria.ID.eq();
		lbase_de_datosActividadCriteria.setMaxResults(ROW_COUNT);
		base_de_datos.Actividad[] base_de_datosActividads = lbase_de_datosActividadCriteria.listActividad();
		length =base_de_datosActividads== null ? 0 : Math.min(base_de_datosActividads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(base_de_datosActividads[i]);
		}
		System.out.println(length + " Actividad record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListNoticiasnuevoData listNoticiasnuevoData = new ListNoticiasnuevoData();
			try {
				listNoticiasnuevoData.listTestData();
				//listNoticiasnuevoData.listByCriteria();
			}
			finally {
				base_de_datos.NoticiasnuevoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
