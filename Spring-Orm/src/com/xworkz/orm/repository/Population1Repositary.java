package com.xworkz.orm.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.orm.entity.PopularionEntity;

@Component
public class Population1Repositary {

	@Autowired
	private SessionFactory factory;

	public Population1Repositary() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void save(PopularionEntity entity) {
		System.out.println("saving:\t" + entity);
		Session session1 = null;
		try (Session session = factory.openSession()) {
			session.beginTransaction();
			session.persist(entity);
			session.getTransaction().commit();
		} catch (Exception e) {
			session1.getTransaction().rollback();
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

	}

}
