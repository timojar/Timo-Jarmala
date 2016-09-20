package main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Aanilevy;
import dao.DaoAanilevy;



public class Main {
	
	final static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main (String [] args){
		
		
		ClassPathXmlApplicationContext konteksti=new ClassPathXmlApplicationContext("konfigutointi.xml");
		
		
		DaoAanilevy dao=(DaoAanilevy)konteksti.getBean("dao");
		
		List<Aanilevy>aanilevyt=dao.haeKaikki();
		
		
		for(Aanilevy a : aanilevyt) {
		   
			
			System.out.println("Nimi: "+a.getNimi()+" Tekijä: "+a.getTekija());
			System.out.println();
		}
		
		
		
	}

}
