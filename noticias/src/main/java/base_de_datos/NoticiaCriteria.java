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

public class NoticiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titulo;
	public final StringExpression texto_corto;
	public final StringExpression texto_largo;
	public final StringExpression imagen;
	public final BooleanExpression eliminada;
	public final CollectionExpression ha_sido_publicada_por;
	
	public NoticiaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titulo = new StringExpression("titulo", this);
		texto_corto = new StringExpression("texto_corto", this);
		texto_largo = new StringExpression("texto_largo", this);
		imagen = new StringExpression("imagen", this);
		eliminada = new BooleanExpression("eliminada", this);
		ha_sido_publicada_por = new CollectionExpression("ORM_Ha_sido_publicada_por", this);
	}
	
	public NoticiaCriteria(PersistentSession session) {
		this(session.createCriteria(Noticia.class));
	}
	
	public NoticiaCriteria() throws PersistentException {
		this(NoticiasnuevoPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createHa_sido_publicada_porCriteria() {
		return new AdministradorCriteria(createCriteria("ORM_Ha_sido_publicada_por"));
	}
	
	public Noticia uniqueNoticia() {
		return (Noticia) super.uniqueResult();
	}
	
	public Noticia[] listNoticia() {
		java.util.List list = super.list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

