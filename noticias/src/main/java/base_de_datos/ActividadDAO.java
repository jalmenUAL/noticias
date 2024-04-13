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

public class ActividadDAO {
	public static Actividad loadActividadByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadActividadByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getActividadByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadActividadByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getActividadByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Actividad) session.load(base_de_datos.Actividad.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Actividad) session.get(base_de_datos.Actividad.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad) session.load(base_de_datos.Actividad.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad) session.get(base_de_datos.Actividad.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryActividad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryActividad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listActividadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listActividadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Actividad as Actividad");
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
	
	public static List queryActividad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Actividad as Actividad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActividad(session, condition, orderBy);
			return (Actividad[]) list.toArray(new Actividad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActividad(session, condition, orderBy, lockMode);
			return (Actividad[]) list.toArray(new Actividad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadActividadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadActividadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Actividad[] actividads = listActividadByQuery(session, condition, orderBy);
		if (actividads != null && actividads.length > 0)
			return actividads[0];
		else
			return null;
	}
	
	public static Actividad loadActividadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Actividad[] actividads = listActividadByQuery(session, condition, orderBy, lockMode);
		if (actividads != null && actividads.length > 0)
			return actividads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActividadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateActividadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateActividadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Actividad as Actividad");
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
	
	public static java.util.Iterator iterateActividadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Actividad as Actividad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad createActividad() {
		return new base_de_datos.Actividad();
	}
	
	public static boolean save(base_de_datos.Actividad actividad) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().saveObject(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Actividad actividad) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().deleteObject(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Actividad actividad)throws PersistentException {
		try {
			if (actividad.getDe() != null) {
				actividad.getDe().ha_realizado.remove(actividad);
			}
			
			return delete(actividad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Actividad actividad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (actividad.getDe() != null) {
				actividad.getDe().ha_realizado.remove(actividad);
			}
			
			try {
				session.delete(actividad);
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
	
	public static boolean refresh(base_de_datos.Actividad actividad) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().refresh(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Actividad actividad) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().evict(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByCriteria(ActividadCriteria actividadCriteria) {
		Actividad[] actividads = listActividadByCriteria(actividadCriteria);
		if(actividads == null || actividads.length == 0) {
			return null;
		}
		return actividads[0];
	}
	
	public static Actividad[] listActividadByCriteria(ActividadCriteria actividadCriteria) {
		return actividadCriteria.listActividad();
	}
}
