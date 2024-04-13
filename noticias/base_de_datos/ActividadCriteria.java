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

public class ActividadCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression deId;
	public final AssociationExpression de;
	public final DateExpression fecha;
	public final StringExpression tipo;
	
	public ActividadCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		deId = new IntegerExpression("de.", this);
		de = new AssociationExpression("de", this);
		fecha = new DateExpression("fecha", this);
		tipo = new StringExpression("tipo", this);
	}
	
	public ActividadCriteria(PersistentSession session) {
		this(session.createCriteria(Actividad.class));
	}
	
	public ActividadCriteria() throws PersistentException {
		this(NoticiasnuevoPersistentManager.instance().getSession());
	}
	
	public RegistradoCriteria createDeCriteria() {
		return new RegistradoCriteria(createCriteria("de"));
	}
	
	public Actividad uniqueActividad() {
		return (Actividad) super.uniqueResult();
	}
	
	public Actividad[] listActividad() {
		java.util.List list = super.list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

