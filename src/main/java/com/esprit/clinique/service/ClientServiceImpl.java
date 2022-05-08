package com.esprit.clinique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esprit.clinique.model.Client;
import com.esprit.clinique.repository.ClientRepository;

@Service //càd c est un service
@Transactional //càd on va utiliser des requetes sur la bd

public class ClientServiceImpl implements ClientService{

	@Autowired // je vais utiliser le phenomene d injection de dependance
	ClientRepository agent;
	
	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return (List<Client>) agent.findAll(); //findAll est developpée dans l interface crudRepository
	}

	@Override
	public Client getClientById(long id) {
		// TODO Auto-generated method stub
		return agent.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Client client) {
		// TODO Auto-generated method stub
		agent.save(client);  //si l objet existe elle va le metre à jour si nn ella va l ajouter
	}

	@Override
	public void deleteClient(long id) {
		// TODO Auto-generated method stub
		agent.deleteById(id);
	}

}
