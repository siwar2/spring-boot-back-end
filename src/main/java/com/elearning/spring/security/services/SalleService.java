package com.elearning.spring.security.services;

import java.util.List;


import com.elearning.spring.models.Salle;

public interface SalleService {
	List<Salle> getAll() ;
	void addSalle(Salle  s);

}
