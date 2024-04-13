/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateNoticiasnuevoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.NoticiasnuevoPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Noticia lbase_de_datosNoticia = base_de_datos.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.NoticiaDAO.save(lbase_de_datosNoticia);
			base_de_datos.Logueado lbase_de_datosLogueado = base_de_datos.LogueadoDAO.loadLogueadoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.LogueadoDAO.save(lbase_de_datosLogueado);
			base_de_datos.Registrado lbase_de_datosRegistrado = base_de_datos.RegistradoDAO.loadRegistradoByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.RegistradoDAO.save(lbase_de_datosRegistrado);
			base_de_datos.Administrador lbase_de_datosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.AdministradorDAO.save(lbase_de_datosAdministrador);
			base_de_datos.Actividad lbase_de_datosActividad = base_de_datos.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			base_de_datos.ActividadDAO.save(lbase_de_datosActividad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Noticia by NoticiaCriteria");
		base_de_datos.NoticiaCriteria lbase_de_datosNoticiaCriteria = new base_de_datos.NoticiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosNoticiaCriteria.ID.eq();
		System.out.println(lbase_de_datosNoticiaCriteria.uniqueNoticia());
		
		System.out.println("Retrieving Logueado by LogueadoCriteria");
		base_de_datos.LogueadoCriteria lbase_de_datosLogueadoCriteria = new base_de_datos.LogueadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosLogueadoCriteria.ID.eq();
		System.out.println(lbase_de_datosLogueadoCriteria.uniqueLogueado());
		
		System.out.println("Retrieving Registrado by RegistradoCriteria");
		base_de_datos.RegistradoCriteria lbase_de_datosRegistradoCriteria = new base_de_datos.RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosRegistradoCriteria.ID.eq();
		System.out.println(lbase_de_datosRegistradoCriteria.uniqueRegistrado());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		base_de_datos.AdministradorCriteria lbase_de_datosAdministradorCriteria = new base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosAdministradorCriteria.ID.eq();
		System.out.println(lbase_de_datosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		base_de_datos.ActividadCriteria lbase_de_datosActividadCriteria = new base_de_datos.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbase_de_datosActividadCriteria.ID.eq();
		System.out.println(lbase_de_datosActividadCriteria.uniqueActividad());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateNoticiasnuevoData retrieveAndUpdateNoticiasnuevoData = new RetrieveAndUpdateNoticiasnuevoData();
			try {
				retrieveAndUpdateNoticiasnuevoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateNoticiasnuevoData.retrieveByCriteria();
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
