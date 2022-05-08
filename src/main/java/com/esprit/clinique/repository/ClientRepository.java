package com.esprit.clinique.repository;

import org.springframework.data.repository.CrudRepository;

import com.esprit.clinique.model.Client;

public interface ClientRepository extends CrudRepository<Client,Long>{ //l'identifiant de la classe client est long

}
