package com.elearning.spring.security.services;

import java.util.List;

import com.elearning.spring.models.Institution;


public interface InstitutService {
	List<Institution> getAll() ;
	void addInstitution(Institution  i);
	void deleteInstitution(Institution  i);
	void updateInstitution(Institution  i);
}
