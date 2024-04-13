/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateNoticiasnuevoDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(base_de_datos.NoticiasnuevoPersistentManager.instance());
			base_de_datos.NoticiasnuevoPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
