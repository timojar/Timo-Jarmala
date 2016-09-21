package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Tunti;



public class TestDaoIplSpring implements TuntiDao{
	
	
	public List <Tunti> haekaikki(){
		
		
		List <Tunti> tunnit=new ArrayList<Tunti>();
		Tunti tunti=new Tunti();
		
		tunti.setId(1);
		
		tunti.setKuvaus("Jotain");;
		
		tunti.setToimenpide("Jotain");
		
		
		
		tunti.setTuntimaara(2.0);
		
		tunnit.add(tunti);
		
		return tunnit;
	}	
	

}
