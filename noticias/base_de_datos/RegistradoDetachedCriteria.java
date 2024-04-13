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

public class RegistradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression login;
	public final StringExpression password;
	public final CollectionExpression ha_realizado;
	
	public RegistradoDetachedCriteria() {
		super(base_de_datos.Registrado.class, base_de_datos.RegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		ha_realizado = new CollectionExpression("ORM_Ha_realizado", this.getDetachedCriteria());
	}
	
	public RegistradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.RegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		ha_realizado = new CollectionExpression("ORM_Ha_realizado", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria createHa_realizadoCriteria() {
		return new ActividadDetachedCriteria(createCriteria("ORM_Ha_realizado"));
	}
	
	public Registrado uniqueRegistrado(PersistentSession session) {
		return (Registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Registrado[] listRegistrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Registrado[]) list.toArray(new Registrado[list.size()]);
	}
}

