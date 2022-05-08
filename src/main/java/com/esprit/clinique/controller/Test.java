package com.esprit.clinique.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.esprit.clinique.model.Client;
import com.esprit.clinique.service.ClientService;

@RestController
public class Test {

	//pour tester ma methode d ajour dans la BD,donc j ai besoin de mon service:	
	@Autowired	
	ClientService clientservice;
		
		
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String Hello() {
		return("Module de gestion des clients");
	}
	
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test(){
		Client c= new Client(1,"Ben Foulen","foulen");
		clientservice.saveOrUpdate(c);//pour ajouter le client dans la bd
		return("Client ajouté");
		
	}
	
	
	
	
}
