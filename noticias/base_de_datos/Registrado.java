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

public class Registrado extends base_de_datos.Logueado {
	public Registrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_REGISTRADO_HA_REALIZADO) {
			return ORM_ha_realizado;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_ha_realizado = new java.util.HashSet();
	
	private void setORM_Ha_realizado(java.util.Set value) {
		this.ORM_ha_realizado = value;
	}
	
	private java.util.Set getORM_Ha_realizado() {
		return ORM_ha_realizado;
	}
	
	public final base_de_datos.ActividadSetCollection ha_realizado = new base_de_datos.ActividadSetCollection(this, _ormAdapter, ORMConstants.KEY_REGISTRADO_HA_REALIZADO, ORMConstants.KEY_ACTIVIDAD_DE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
