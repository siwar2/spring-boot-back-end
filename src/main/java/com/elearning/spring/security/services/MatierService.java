package com.elearning.spring.security.services;

import java.util.List;
import com.elearning.spring.models.Matiere;

public interface MatierService {
	List<Matiere> getAll() ;
	void addMatiere(Matiere  m);
}
