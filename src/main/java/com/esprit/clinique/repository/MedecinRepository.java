package com.esprit.clinique.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.esprit.clinique.model.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long>{

	//ces 3requetes nommées : on utilise le nom de la table medecin
	//select * from medecin where specialite='....';
	public List<Medecin> findBySpecialite(String specialite);
	
	//select * from medecin where specialite='....' and nom='......';
	public List<Medecin> findBySpecialiteAndNom(String specialite, String nom);
	
	//select * from medecin where specialite='....' or nom='....';
	public List<Medecin> findBySpecialiteOrNom(String specialite, String nom);
	
	
	//cette requete specifique: on utilise le nom de la classe Medecin
	@Query(value="Select m from Medecin m where m.specialite= :spec " //il faut laisse un espace apre spec
			+ "and ( m.nom Like :pseudo or m.prenom Like :pseudo)")
	public List<Medecin> Search(@Param("spec") String s,
			@Param("pseudo") String p);
	
}
