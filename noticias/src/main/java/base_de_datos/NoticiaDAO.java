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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class NoticiaDAO {
	public static Noticia loadNoticiaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadNoticiaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getNoticiaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Noticia) session.load(base_de_datos.Noticia.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Noticia) session.get(base_de_datos.Noticia.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.load(base_de_datos.Noticia.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia getNoticiaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Noticia) session.get(base_de_datos.Noticia.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryNoticia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNoticia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia[] listNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNoticia(session, condition, orderBy, lockMode);
			return (Noticia[]) list.toArray(new Noticia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static Noticia loadNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Noticia[] noticias = listNoticiaByQuery(session, condition, orderBy, lockMode);
		if (noticias != null && noticias.length > 0)
			return noticias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateNoticiaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNoticiaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Noticia as Noticia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Noticia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia createNoticia() {
		return new base_de_datos.Noticia();
	}
	
	public static boolean save(base_de_datos.Noticia noticia) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().saveObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Noticia noticia) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().deleteObject(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Noticia noticia)throws PersistentException {
		try {
			base_de_datos.Administrador[] lHa_sido_publicada_pors = noticia.ha_sido_publicada_por.toArray();
			for(int i = 0; i < lHa_sido_publicada_pors.length; i++) {
				lHa_sido_publicada_pors[i].ha_publicado.remove(noticia);
			}
			return delete(noticia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Noticia noticia, org.orm.PersistentSession session)throws PersistentException {
		try {
			base_de_datos.Administrador[] lHa_sido_publicada_pors = noticia.ha_sido_publicada_por.toArray();
			for(int i = 0; i < lHa_sido_publicada_pors.length; i++) {
				lHa_sido_publicada_pors[i].ha_publicado.remove(noticia);
			}
			try {
				session.delete(noticia);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(base_de_datos.Noticia noticia) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().refresh(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Noticia noticia) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().evict(noticia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Noticia loadNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		Noticia[] noticias = listNoticiaByCriteria(noticiaCriteria);
		if(noticias == null || noticias.length == 0) {
			return null;
		}
		return noticias[0];
	}
	
	public static Noticia[] listNoticiaByCriteria(NoticiaCriteria noticiaCriteria) {
		return noticiaCriteria.listNoticia();
	}
}
