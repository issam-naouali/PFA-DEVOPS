package com.esprit.clinique.model;

import java.util.ArrayList;
import java.util.List;

public class AdvancedRecherche {

    private String specialite;
    
    private String nom;
	
	private List<Medecin> listmed;
	
	public AdvancedRecherche() {
		super();
		this.specialite="";
		this.nom="";
		this.listmed= new ArrayList<>();
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Medecin> getListmed() {
		return listmed;
	}

	public void setListmed(List<Medecin> listmed) {
		this.listmed = listmed;
	}
	
	
}
