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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression login;
	public final StringExpression password;
	public final CollectionExpression ha_publicado;
	
	public AdministradorDetachedCriteria() {
		super(base_de_datos.Administrador.class, base_de_datos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		ha_publicado = new CollectionExpression("ORM_Ha_publicado", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		ha_publicado = new CollectionExpression("ORM_Ha_publicado", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria createHa_publicadoCriteria() {
		return new NoticiaDetachedCriteria(createCriteria("ORM_Ha_publicado"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

