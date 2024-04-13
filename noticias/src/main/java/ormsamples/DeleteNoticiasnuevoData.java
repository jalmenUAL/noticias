/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteNoticiasnuevoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = base_de_datos.NoticiasnuevoPersistentManager.instance().getSession().beginTransaction();
		try {
			base_de_datos.Noticia lbase_de_datosNoticia = base_de_datos.NoticiaDAO.loadNoticiaByQuery(null, null);
			// Delete the persistent object
			base_de_datos.NoticiaDAO.delete(lbase_de_datosNoticia);
			base_de_datos.Logueado lbase_de_datosLogueado = base_de_datos.LogueadoDAO.loadLogueadoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.LogueadoDAO.delete(lbase_de_datosLogueado);
			base_de_datos.Registrado lbase_de_datosRegistrado = base_de_datos.RegistradoDAO.loadRegistradoByQuery(null, null);
			// Delete the persistent object
			base_de_datos.RegistradoDAO.delete(lbase_de_datosRegistrado);
			base_de_datos.Administrador lbase_de_datosAdministrador = base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			base_de_datos.AdministradorDAO.delete(lbase_de_datosAdministrador);
			base_de_datos.Actividad lbase_de_datosActividad = base_de_datos.ActividadDAO.loadActividadByQuery(null, null);
			// Delete the persistent object
			base_de_datos.ActividadDAO.delete(lbase_de_datosActividad);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteNoticiasnuevoData deleteNoticiasnuevoData = new DeleteNoticiasnuevoData();
			try {
				deleteNoticiasnuevoData.deleteTestData();
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
