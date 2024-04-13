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

public class ActividadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression deId;
	public final AssociationExpression de;
	public final DateExpression fecha;
	public final StringExpression tipo;
	
	public ActividadDetachedCriteria() {
		super(base_de_datos.Actividad.class, base_de_datos.ActividadCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		deId = new IntegerExpression("de.", this.getDetachedCriteria());
		de = new AssociationExpression("de", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.ActividadCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		deId = new IntegerExpression("de.", this.getDetachedCriteria());
		de = new AssociationExpression("de", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
	}
	
	public RegistradoDetachedCriteria createDeCriteria() {
		return new RegistradoDetachedCriteria(createCriteria("de"));
	}
	
	public Actividad uniqueActividad(PersistentSession session) {
		return (Actividad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Actividad[] listActividad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

