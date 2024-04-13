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

public class RegistradoDAO {
	public static Registrado loadRegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadRegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado getRegistradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getRegistradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado loadRegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadRegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado getRegistradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getRegistradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado loadRegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Registrado) session.load(base_de_datos.Registrado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado getRegistradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Registrado) session.get(base_de_datos.Registrado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado loadRegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Registrado) session.load(base_de_datos.Registrado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado getRegistradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Registrado) session.get(base_de_datos.Registrado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryRegistrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryRegistrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado[] listRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado[] listRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Registrado as Registrado");
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
	
	public static List queryRegistrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Registrado as Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Registrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado[] listRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRegistrado(session, condition, orderBy);
			return (Registrado[]) list.toArray(new Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado[] listRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRegistrado(session, condition, orderBy, lockMode);
			return (Registrado[]) list.toArray(new Registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado loadRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado loadRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado loadRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Registrado[] registrados = listRegistradoByQuery(session, condition, orderBy);
		if (registrados != null && registrados.length > 0)
			return registrados[0];
		else
			return null;
	}
	
	public static Registrado loadRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Registrado[] registrados = listRegistradoByQuery(session, condition, orderBy, lockMode);
		if (registrados != null && registrados.length > 0)
			return registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Registrado as Registrado");
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
	
	public static java.util.Iterator iterateRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Registrado as Registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Registrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado createRegistrado() {
		return new base_de_datos.Registrado();
	}
	
	public static boolean save(base_de_datos.Registrado registrado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().saveObject(registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Registrado registrado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().deleteObject(registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Registrado registrado)throws PersistentException {
		try {
			base_de_datos.Actividad[] lHa_realizados = registrado.ha_realizado.toArray();
			for(int i = 0; i < lHa_realizados.length; i++) {
				lHa_realizados[i].setDe(null);
			}
			return delete(registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(base_de_datos.Registrado registrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			base_de_datos.Actividad[] lHa_realizados = registrado.ha_realizado.toArray();
			for(int i = 0; i < lHa_realizados.length; i++) {
				lHa_realizados[i].setDe(null);
			}
			try {
				session.delete(registrado);
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
	
	public static boolean refresh(base_de_datos.Registrado registrado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().refresh(registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Registrado registrado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().evict(registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Registrado loadRegistradoByCriteria(RegistradoCriteria registradoCriteria) {
		Registrado[] registrados = listRegistradoByCriteria(registradoCriteria);
		if(registrados == null || registrados.length == 0) {
			return null;
		}
		return registrados[0];
	}
	
	public static Registrado[] listRegistradoByCriteria(RegistradoCriteria registradoCriteria) {
		return registradoCriteria.listRegistrado();
	}
}
