package com.esprit.clinique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.esprit.clinique.model.Client;
import com.esprit.clinique.service.ClientService;


@RestController
public class ClientRest {
	
	@Autowired
	ClientService clientservice;
	
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView Home() {
		ModelAndView model = new ModelAndView();
		model.setViewName("HomePage");
		return (model);
	}
	

	@RequestMapping(value = "/clients/add", method = RequestMethod.GET)  //lorsque je demande le formulaire j utilise GET
	public ModelAndView ajouter_client() {  //cette methode va retourner un objet de type ModelAndView
		ModelAndView model = new ModelAndView();
		Client c = new Client(); // le modèle est une instance de la classe client (le modele c est l objet qui va etre remplie par l interface)
		model.addObject("clientForm", c); // ajout du modéle
		//ce nom clientForm est le mm qui doit etre ajouté dans page html :    th:object="${clientForm}" càd l'objet créé ds page html 
		
		model.setViewName("Client_Form"); // indiquer le nom de la page html qui va etre affiché
		return (model);

	}	

	/*@RequestMapping(value = "/clients/save", method = RequestMethod.POST) //lorsque je remplis le formulaire j utilise POST
	public String save(@ModelAttribute("clientForm") Client c) { //je vais recuperer le modele clientForm en client c

		clientservice.saveOrUpdate(c);

		//return (new ModelAndView("redirect:/clients/list"));
		return ("Client ajouté");

	}*/
	
	@RequestMapping(value = "/clients/save", method = RequestMethod.POST) //lorsque je remplis le formulaire j utilise POST
	public ModelAndView save(@ModelAttribute("clientForm") Client c) { //je vais recuperer le modele clientForm en client c

		clientservice.saveOrUpdate(c);
		return (new ModelAndView("redirect:/clients/list"));
		
	}
	
	
	@RequestMapping(value = "/clients/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView();
		/* récupérer la liste des clients à partir de la base */
		List<Client> listcl = clientservice.getAllClients();
		model.addObject("clients", listcl);
		/* indiquer le nom de la page html à afficher */
		model.setViewName("Consulte_Clients");//nom de page web
		return (model);

	}
	


	@RequestMapping(value = "/clients/update/{id}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") long id) {
		ModelAndView model = new ModelAndView();
		
		Client cl = clientservice.getClientById(id);
		model.addObject("clientForm", cl);
		model.setViewName("Client_EditForm");

		return model;
	}

	@RequestMapping(value = "/clients/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") long id) {
				
		clientservice.deleteClient(id);
		return (new ModelAndView("redirect:/clients/list"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/clients",method = RequestMethod.GET)
	public String Bonjour(){
		
		return "Tu es la bienvenue dans le module de gestion des clients";
		
	}
	
	@RequestMapping(value="/clients/test",method = RequestMethod.GET)
	public String test(){
		
		Client c = new Client(10102,"issam","NAOUALI");
		
		clientservice.saveOrUpdate(c);
		
		return "Client Ajouté";
		
	}
}
