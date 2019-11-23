/**
 * 
 */
package org.kesina.angular.swe642;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * @author kesin
 *
 */
public class DatabaseService {
	

	/**
	 * @param args
	 */

	
	public static void main() {

/*	USED FOR TESTING ONLY
 * 
 * EntityManagerFactory emff = null;
			emff= getEntityManager(emff);
			getStudent(emff,"1");
			closeCall(emff);*/
	}
	
	public static Student find(Object id) {
		EntityManagerFactory  emf = null;
  	  	emf= DatabaseService.getEntityManager(emf);
		EntityManager em = emf.createEntityManager();
		Student obj = em.find(Student.class, id);
		closeCall(emf);
		return obj;
	}
	
	public static void closeCall(EntityManagerFactory emf) {
		emf.close();
		
	}
	public static EntityManagerFactory getEntityManager(EntityManagerFactory emf ) {
		String persistenceUnitName = "AngularKesinaSWE642";
		 emf = Persistence.createEntityManagerFactory(persistenceUnitName );
		return emf;
	}
	


	public static <T> List<T> findAll(){
		EntityManagerFactory  emf = null;
  	  	emf= DatabaseService.getEntityManager(emf);
		EntityManager em = emf.createEntityManager();
		

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Object> cq = cb.createQuery();
		Root<Student> c = cq.from(Student.class);
		cq.select(c);
		cq.orderBy(cb.asc(c.get("studentId")));
		List<T> list = (List<T>) em.createQuery(cq).getResultList();
		em.close();
		return list;
			
		/*CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(Student.class));
		List<T> list = (List<T>) em.createQuery(cq).getResultList();
		em.close();
		return list;*/
	}
	

/*	USING TYPED QUERY
 * public static void getStudent(EntityManagerFactory emf, String id) {
		System.out.println("GOT STUDENT!!!");
		EntityManager em = emf.createEntityManager();
		String query = "SELECT s FROM Student s WHERE s.studentId = :sId";
		TypedQuery<Student> tq = em.createQuery	(query,Student.class);
		tq.setParameter("sId", id);
		Student sb = null;
		try {
			sb = tq.getSingleResult();
			System.out.println("IN HERE");
		}
		catch(NoResultException ne) {
			ne.printStackTrace();
		}
		finally {
			em.close();
		}
	}
	
	public static List<Student> getAllStudent() {
		EntityManagerFactory  emf = null;
		emf = getEntityManager(emf);
		EntityManager em = emf.createEntityManager();
		String query = "SELECT s FROM Student s WHERE s.id IS NOT NULL";
		TypedQuery<Student> tq = em.createQuery(query,Student.class);
		List<Student> sb = null;
		try {
			sb = tq.getResultList();
		}
		catch(NoResultException ne) {
			ne.printStackTrace();
		}
		finally {
			em.close();
		}
		return sb;
	}*/

}
