package com.Phoneix.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Phoneix.dto.Phoneix;


public class PhoneixDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Phoneix p) {
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}
	
	public Object findById(String email,String pass) {
		Phoneix st = entityManager.find(Phoneix.class, email);
		if (st != null && pass.equals(st.getPassword())) {
			return st;
		} else {
			return "";
		}

	}
	
	public void update(Phoneix p) {
		entityTransaction.begin();
		entityManager.merge(p);
		entityTransaction.commit();
	}
	public Object findById(String email) {
		Phoneix st = entityManager.find(Phoneix.class, email);
		if (st != null) {
			return st;
		} else {
			return "";
		}

	}

}
