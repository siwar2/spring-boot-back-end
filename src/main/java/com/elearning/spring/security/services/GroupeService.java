package com.elearning.spring.security.services;

import java.util.List;
import com.elearning.spring.models.Groupe;

public interface GroupeService {
	List<Groupe> getAll() ;
	void addGroupe(Groupe  g);
	void deleteGroupe(Groupe g);
}
