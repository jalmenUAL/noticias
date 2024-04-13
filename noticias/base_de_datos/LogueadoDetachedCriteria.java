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

public class LogueadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression login;
	public final StringExpression password;
	
	public LogueadoDetachedCriteria() {
		super(base_de_datos.Logueado.class, base_de_datos.LogueadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public LogueadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.LogueadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Logueado uniqueLogueado(PersistentSession session) {
		return (Logueado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Logueado[] listLogueado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Logueado[]) list.toArray(new Logueado[list.size()]);
	}
}

