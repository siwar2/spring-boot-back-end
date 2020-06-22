package com.elearning.spring.security.services;

import java.util.List;

import com.elearning.spring.models.Salle;
import com.elearning.spring.models.Seance;

public interface SeanceService {
	List<Seance> getAll() ;
	void addSeance(Seance  sc);
	void deleteSeance(Seance sc);
	void updateSeance(Seance sc);
}
