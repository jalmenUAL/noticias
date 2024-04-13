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

public class LogueadoDAO {
	public static Logueado loadLogueadoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadLogueadoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado getLogueadoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getLogueadoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado loadLogueadoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadLogueadoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado getLogueadoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return getLogueadoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado loadLogueadoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Logueado) session.load(base_de_datos.Logueado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado getLogueadoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Logueado) session.get(base_de_datos.Logueado.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado loadLogueadoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Logueado) session.load(base_de_datos.Logueado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado getLogueadoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Logueado) session.get(base_de_datos.Logueado.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLogueado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryLogueado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLogueado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return queryLogueado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado[] listLogueadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listLogueadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado[] listLogueadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return listLogueadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLogueado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Logueado as Logueado");
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
	
	public static List queryLogueado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Logueado as Logueado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Logueado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado[] listLogueadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLogueado(session, condition, orderBy);
			return (Logueado[]) list.toArray(new Logueado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado[] listLogueadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLogueado(session, condition, orderBy, lockMode);
			return (Logueado[]) list.toArray(new Logueado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado loadLogueadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadLogueadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado loadLogueadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return loadLogueadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado loadLogueadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Logueado[] logueados = listLogueadoByQuery(session, condition, orderBy);
		if (logueados != null && logueados.length > 0)
			return logueados[0];
		else
			return null;
	}
	
	public static Logueado loadLogueadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Logueado[] logueados = listLogueadoByQuery(session, condition, orderBy, lockMode);
		if (logueados != null && logueados.length > 0)
			return logueados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLogueadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateLogueadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLogueadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = NoticiasnuevoPersistentManager.instance().getSession();
			return iterateLogueadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLogueadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Logueado as Logueado");
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
	
	public static java.util.Iterator iterateLogueadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From base_de_datos.Logueado as Logueado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Logueado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado createLogueado() {
		return new base_de_datos.Logueado();
	}
	
	public static boolean save(base_de_datos.Logueado logueado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().saveObject(logueado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(base_de_datos.Logueado logueado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().deleteObject(logueado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(base_de_datos.Logueado logueado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().refresh(logueado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(base_de_datos.Logueado logueado) throws PersistentException {
		try {
			NoticiasnuevoPersistentManager.instance().getSession().evict(logueado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Logueado loadLogueadoByCriteria(LogueadoCriteria logueadoCriteria) {
		Logueado[] logueados = listLogueadoByCriteria(logueadoCriteria);
		if(logueados == null || logueados.length == 0) {
			return null;
		}
		return logueados[0];
	}
	
	public static Logueado[] listLogueadoByCriteria(LogueadoCriteria logueadoCriteria) {
		return logueadoCriteria.listLogueado();
	}
}
