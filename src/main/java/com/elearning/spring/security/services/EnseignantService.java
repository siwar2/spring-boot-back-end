package com.elearning.spring.security.services;

import java.util.List;

import com.elearning.spring.models.Enseignant;

public interface EnseignantService {
	List<Enseignant> getAll() ;
	void addEnseignant(Enseignant  ens);
	void deleteEnseignant(Enseignant g);
}
