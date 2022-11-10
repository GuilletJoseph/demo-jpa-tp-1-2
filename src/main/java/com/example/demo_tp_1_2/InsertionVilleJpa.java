package com.example.demo_tp_1_2;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Categorie;
import entities.Ville;

public class InsertionVilleJpa {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-ville-tp-1-2");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction transaction = em.getTransaction();
		
		Ville ville =new Ville();
		ville.setNom("Nantes");
		ville.setCodePostal(44000);
		ville.setCategorie(Categorie.GRANDE);
		 String str="2015-03-31";  
		    Date date=Date.valueOf(str);
		ville.setDernierRes(date);
		
		
		transaction.begin();
		em.persist(ville);
		transaction.commit();
		
		Ville ville2 =new Ville();
		ville2.setNom("Angers");
		ville2.setCodePostal(49000);
		ville2.setCategorie(Categorie.MOYENNE);
		 str="2017-06-23";  
		    date=Date.valueOf(str);
		ville2.setDernierRes(date);
		
		transaction.begin();
		em.persist(ville2);
		transaction.commit();
		
		
	}

}
