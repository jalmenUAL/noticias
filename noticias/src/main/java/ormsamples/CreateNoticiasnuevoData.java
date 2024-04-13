/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateNoticiasnuevoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.NoticiasnuevoPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Noticia lbase_de_datosNoticia = base_de_datos.NoticiaDAO.createNoticia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ha_sido_publicada_por, eliminada
			base_de_datos.NoticiaDAO.save(lbase_de_datosNoticia);
			base_de_datos.Logueado lbase_de_datosLogueado = base_de_datos.LogueadoDAO.createLogueado();
			// Initialize the properties of the persistent object here
			base_de_datos.LogueadoDAO.save(lbase_de_datosLogueado);
			base_de_datos.Registrado lbase_de_datosRegistrado = base_de_datos.RegistradoDAO.createRegistrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ha_realizado
			base_de_datos.RegistradoDAO.save(lbase_de_datosRegistrado);
			base_de_datos.Administrador lbase_de_datosAdministrador = base_de_datos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ha_publicado
			base_de_datos.AdministradorDAO.save(lbase_de_datosAdministrador);
			base_de_datos.Actividad lbase_de_datosActividad = base_de_datos.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : de
			base_de_datos.ActividadDAO.save(lbase_de_datosActividad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateNoticiasnuevoData createNoticiasnuevoData = new CreateNoticiasnuevoData();
			try {
				createNoticiasnuevoData.createTestData();
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
