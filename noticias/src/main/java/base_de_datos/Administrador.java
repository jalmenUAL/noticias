/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package base_de_datos;

public class Administrador extends base_de_datos.Logueado {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_HA_PUBLICADO) {
			return ORM_ha_publicado;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_ha_publicado = new java.util.HashSet();
	
	private void setORM_Ha_publicado(java.util.Set value) {
		this.ORM_ha_publicado = value;
	}
	
	private java.util.Set getORM_Ha_publicado() {
		return ORM_ha_publicado;
	}
	
	public final base_de_datos.NoticiaSetCollection ha_publicado = new base_de_datos.NoticiaSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_HA_PUBLICADO, ORMConstants.KEY_NOTICIA_HA_SIDO_PUBLICADA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
