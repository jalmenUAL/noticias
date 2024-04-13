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

public class Noticia {
	public Noticia() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_NOTICIA_HA_SIDO_PUBLICADA_POR) {
			return ORM_ha_sido_publicada_por;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String titulo;
	
	private String texto_corto;
	
	private String texto_largo;
	
	private String imagen;
	
	private boolean eliminada;
	
	private java.util.Set ORM_ha_sido_publicada_por = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTexto_corto(String value) {
		this.texto_corto = value;
	}
	
	public String getTexto_corto() {
		return texto_corto;
	}
	
	public void setTexto_largo(String value) {
		this.texto_largo = value;
	}
	
	public String getTexto_largo() {
		return texto_largo;
	}
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setEliminada(boolean value) {
		this.eliminada = value;
	}
	
	public boolean getEliminada() {
		return eliminada;
	}
	
	private void setORM_Ha_sido_publicada_por(java.util.Set value) {
		this.ORM_ha_sido_publicada_por = value;
	}
	
	private java.util.Set getORM_Ha_sido_publicada_por() {
		return ORM_ha_sido_publicada_por;
	}
	
	public final base_de_datos.AdministradorSetCollection ha_sido_publicada_por = new base_de_datos.AdministradorSetCollection(this, _ormAdapter, ORMConstants.KEY_NOTICIA_HA_SIDO_PUBLICADA_POR, ORMConstants.KEY_ADMINISTRADOR_HA_PUBLICADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
