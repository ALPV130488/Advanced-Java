package jpaex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Employee1 emp = new Employee1(123, "java", 123445, "hyd");
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println(emp);
		
		

	}

}
