package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.TuntiDao;
import bean.Tunti;

@Controller
@RequestMapping(value = "/tunnit")
public class TuntiController {
	private TuntiDao dao;
	
	
	
	
	
	
	public TuntiDao getDao() {
		return dao;
	}

	public void setDao(TuntiDao dao) {
		this.dao = dao;
	}

	// FORMIN TEKEMINEN
	@RequestMapping(value = "uusi", method = RequestMethod.GET)
	public String getCreateForm(Model model) {

		model.addAttribute("tunti", new Tunti());
		return "tunt/IlmoitaTunti";
	}

	// FORMIN TIETOJEN VASTAANOTTO
	@RequestMapping(value = "uusi", method = RequestMethod.POST)
	public String create(@ModelAttribute(value = "tunti") Tunti tunti) {
      
		return "redirect:/tunnit/" + tunti.getId();
	}

	// HENKILÖN TIETOJEN NÄYTTÄMINEN
	@RequestMapping(value = "viewk", method = RequestMethod.GET)
	public String getView(@PathVariable Integer id, Model model) {
		List <Tunti> tunnit = dao.haekaikki();
		model.addAttribute("tunnit", tunnit);
		Tunti t=tunnit.get(0);
		
		System.out.println(t.getKuvaus());
		
		return "tunt/view";
	}
	
	
	@RequestMapping(value = "views", method = RequestMethod.GET)
	public ModelAndView getdata() {
		System.out.println("koko");
		
		
Tunti tunti=new Tunti();
		
		tunti.setId(1);
		
		tunti.setKuvaus("Jotain");;
		
		tunti.setToimenpide("Jotain");
		
		
		
		tunti.setTuntimaara(2.0);
		
		
		
		
		List<Tunti> list = new ArrayList<Tunti>();
		list.add(tunti);

		System.out.println("koko"+list.size());
		
		
		//return back to index.jsp
		ModelAndView model = new ModelAndView("tunt/view");
		model.addObject("lists", list);

		return model;

	}

}
