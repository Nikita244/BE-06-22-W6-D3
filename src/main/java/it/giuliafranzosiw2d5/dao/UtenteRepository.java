package it.giuliafranzosiw2d5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giuliafranzosiw2d5.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	
	Utente findById(int id);
}
