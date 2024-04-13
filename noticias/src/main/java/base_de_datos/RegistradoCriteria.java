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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class RegistradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression login;
	public final StringExpression password;
	public final CollectionExpression ha_realizado;
	
	public RegistradoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		ha_realizado = new CollectionExpression("ORM_Ha_realizado", this);
	}
	
	public RegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(Registrado.class));
	}
	
	public RegistradoCriteria() throws PersistentException {
		this(NoticiasnuevoPersistentManager.instance().getSession());
	}
	
	public ActividadCriteria createHa_realizadoCriteria() {
		return new ActividadCriteria(createCriteria("ORM_Ha_realizado"));
	}
	
	public Registrado uniqueRegistrado() {
		return (Registrado) super.uniqueResult();
	}
	
	public Registrado[] listRegistrado() {
		java.util.List list = super.list();
		return (Registrado[]) list.toArray(new Registrado[list.size()]);
	}
}

