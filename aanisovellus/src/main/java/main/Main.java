package main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Aanilevy;
import dao.DaoAanilevy;


public class Main {
	
	
	
	public static void main (String [] args){
		
		
		ClassPathXmlApplicationContext konteksti=new ClassPathXmlApplicationContext("konfigutointi.xml");
		
		
		DaoAanilevy dao=(DaoAanilevy)konteksti.getBean("dao");
		
		List<Aanilevy>aanilevyt=dao.haeKaikki();
		
		
		for(Aanilevy a : aanilevyt) {
		   
			
			System.out.println(a.getNimi());
		}
		
		
		
	}

}
