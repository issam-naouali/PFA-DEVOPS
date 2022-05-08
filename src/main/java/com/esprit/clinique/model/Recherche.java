package com.esprit.clinique.model;

import java.util.ArrayList;
import java.util.List;

public class Recherche { // c est une classe de traitement donc sans @Entity car on la veut pas dans la BD 
	//j ai tjrs une vue avec un modele caché en arriere plan c est pr ça on a créé cette classe pr respecter le modele MVC

	private String specialite;
	
	private List<Medecin> listmed;
	
	public Recherche() {
		super();
		this.specialite="";
		this.listmed= new ArrayList<>();
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	

	public List<Medecin> getListmed() {
		return listmed;
	}

	public void setListmed(List<Medecin> listmed) {
		this.listmed = listmed;
	}
	
}
