package com.esprit.clinique.service;

import java.util.List;

import com.esprit.clinique.model.Medecin;

public interface MedecinService {
	
     public List<Medecin> getAllMedecins();
	 
	 public List<Medecin> findBySpecialite(String spec);
	 
	 public List<Medecin> findBySpecialiteAndNom(String spec,String nom);
	 
	 public Medecin getMedecinById(long id);
	  
	 public void saveOrUpdate(Medecin med);
	 
	 public void deleteMedecin(long id);
	 
	 public List<Medecin> Search(String spec, String pseudo);
}
