package com.xworkz.orm.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.orm.entity.PopularionEntity;



@Component
public class PopulationRepositary {

	
	
	
	public PopulationRepositary() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void save(PopularionEntity entity) {
		System.out.println("saving:\t" + entity);
		SessionFactory factory = new Configuration().configure("resource/mysql.xml").buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.persist(entity);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		finally {
			session.close();
			factory.close();

		}

	}

}
