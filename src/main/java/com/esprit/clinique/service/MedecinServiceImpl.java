package com.esprit.clinique.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.clinique.repository.MedecinRepository;
import com.esprit.clinique.model.Medecin;

@Service
@Transactional
public class MedecinServiceImpl implements MedecinService{

	@Autowired	
	MedecinRepository agent;
	
	@Override
	public List<Medecin> getAllMedecins() {
		// TODO Auto-generated method stub
		return (List<Medecin>) agent.findAll();
	}

	

	@Override
	public Medecin getMedecinById(long id) {
		// TODO Auto-generated method stub
		return agent.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Medecin med) {
		// TODO Auto-generated method stub
		agent.save(med);
	}

	@Override
	public void deleteMedecin(long id) {
		// TODO Auto-generated method stub
		agent.deleteById(id);
	}

	@Override
	public List<Medecin> findBySpecialite(String spec) {
		// TODO Auto-generated method stub
		return agent.findBySpecialite(spec);
	}
	
	@Override
	public List<Medecin> findBySpecialiteAndNom(String spec, String nom) {
		// TODO Auto-generated method stub
		return agent.findBySpecialiteAndNom(spec,nom);
	}
	
	@Override
	public List<Medecin> Search(String spec, String pseudo) {
		// TODO Auto-generated method stub
		return agent.Search(spec, pseudo);
	}

}
