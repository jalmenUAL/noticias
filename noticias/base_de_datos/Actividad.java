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

public class Actividad {
	public Actividad() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ACTIVIDAD_DE) {
			this.de = (base_de_datos.Registrado) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private base_de_datos.Registrado de;
	
	private java.util.Date fecha;
	
	private String tipo;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDe(base_de_datos.Registrado value) {
		if (de != null) {
			de.ha_realizado.remove(this);
		}
		if (value != null) {
			value.ha_realizado.add(this);
		}
	}
	
	public base_de_datos.Registrado getDe() {
		return de;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_De(base_de_datos.Registrado value) {
		this.de = value;
	}
	
	private base_de_datos.Registrado getORM_De() {
		return de;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
