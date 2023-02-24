package com.xworkz.festival.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class FestivalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		FestivalEntity entity=new FestivalEntity("Ugadi", "Karnataka", 2, "Paysa", "Chandra");
		FestivalEntity entity2=new FestivalEntity("shivaratri", "Karnataka", 5, "holge", "Shiva");
		FestivalEntity entity3=new FestivalEntity("Rama navami", "Karnataka", 3, "paanaka", "Rama");
		FestivalEntity entity4=new FestivalEntity("Hanumar jayanti", "Karnataka", 1, "kesari bath", "anjaneya");
		FestivalEntity entity5=new FestivalEntity("Gwori Ganesha", "India", 6, "kargukayi", "gwori");
		FestivalEntity entity6=new FestivalEntity("Mahamastakabhisheka", "Hindu", 5, "Paysa", "lord shankara");
		FestivalEntity entity7=new FestivalEntity("Lakshmi pooge", "Karnataka", 4, "laadu", "lakhsmi");
		FestivalEntity entity8=new FestivalEntity("Diwali", "India", 12, "holge", "navaShakti");
		FestivalEntity entity9=new FestivalEntity("Ugadi", "India", 9, "chanpakali", "Chandra");
		FestivalEntity entity10=new FestivalEntity("Ayadha pooje", "Karnataka", 8, "kumbalakayi", "Ayudh");
		FestivalEntity entity11=new FestivalEntity("Makar Sakranti", "Indian", 7, "ellu bella", "Ayyappa");
		FestivalEntity entity12=new FestivalEntity("Pongal", "Tamil naadu", 12, "pongal", "subramanya");
		FestivalEntity entity13=new FestivalEntity("Holi", "India", 17, "colurs", "Kamenna");
		FestivalEntity entity14=new FestivalEntity("Buddha Jayanti", "Jaisies", 13, "chacolate", "Budda");
		FestivalEntity entity15=new FestivalEntity("Eid Ul Fitr", "Muslim", 11, "sweet biriyani", "Alla");
		FestivalEntity entity16=new FestivalEntity("Ratha Yatra", "Hindu", 10, "shavge paysa", "yatra");
		FestivalEntity entity17=new FestivalEntity("Raksha Bandhan", "Indian", 2, "ellu holage", "Brother");
		FestivalEntity entity18=new FestivalEntity("Janmashtmi", "Hindu", 1, "mudde", "Krishna");
		FestivalEntity entity19=new FestivalEntity("Onam", "kerala", 21, "pongal", "sumramanya");
		FestivalEntity entity20=new FestivalEntity("Ganesh Chaturthi", "laddu", 15, "Paysa", "Ganesha");
		FestivalEntity entity21=new FestivalEntity("Navratri", "Hindu", 7, "kaayi holage", "durgamba");
		FestivalEntity entity22=new FestivalEntity("Christmas", "Cristian", 5, "cake", "jesius");
		FestivalEntity entity23=new FestivalEntity("Gurupurab", "Hindu", 7, "biscket", "guru");
		FestivalEntity entity24=new FestivalEntity("Durga Puja", "Hindu", 2, "mysur pak", "durga");
		FestivalEntity entity25=new FestivalEntity("Independence Day", "Indian", 3, "chocolate", "gandi");
		
		manager.persist(entity);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		manager.persist(entity20);
		manager.persist(entity21);
		manager.persist(entity22);
		manager.persist(entity23);
		manager.persist(entity24);
		manager.persist(entity25);
		transaction.commit();
		manager.close();

	}

}
