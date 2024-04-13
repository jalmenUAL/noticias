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

public class NoticiaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titulo;
	public final StringExpression texto_corto;
	public final StringExpression texto_largo;
	public final StringExpression imagen;
	public final BooleanExpression eliminada;
	public final CollectionExpression ha_sido_publicada_por;
	
	public NoticiaDetachedCriteria() {
		super(base_de_datos.Noticia.class, base_de_datos.NoticiaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		texto_corto = new StringExpression("texto_corto", this.getDetachedCriteria());
		texto_largo = new StringExpression("texto_largo", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		eliminada = new BooleanExpression("eliminada", this.getDetachedCriteria());
		ha_sido_publicada_por = new CollectionExpression("ORM_Ha_sido_publicada_por", this.getDetachedCriteria());
	}
	
	public NoticiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, base_de_datos.NoticiaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		texto_corto = new StringExpression("texto_corto", this.getDetachedCriteria());
		texto_largo = new StringExpression("texto_largo", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		eliminada = new BooleanExpression("eliminada", this.getDetachedCriteria());
		ha_sido_publicada_por = new CollectionExpression("ORM_Ha_sido_publicada_por", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createHa_sido_publicada_porCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("ORM_Ha_sido_publicada_por"));
	}
	
	public Noticia uniqueNoticia(PersistentSession session) {
		return (Noticia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Noticia[] listNoticia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Noticia[]) list.toArray(new Noticia[list.size()]);
	}
}

