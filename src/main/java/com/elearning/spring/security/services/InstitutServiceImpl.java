package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Institution;
import com.elearning.spring.repository.InstitutRepository;
import com.elearning.spring.repository.MatierRepository;
@Service
public class InstitutServiceImpl implements InstitutService {
	@Autowired
	private  InstitutRepository  institutRepository ;
	@Override
	public List<Institution> getAll() {
		
		return institutRepository.findAll();
	}

	@Override
	public void addInstitution(Institution i) {
	this.institutRepository.save(i);
		
	}

	@Override
	public void deleteInstitution(Institution i) {
		this.institutRepository.delete(i);
		
	}

	@Override
	public void updateInstitution(Institution i) {
		this.institutRepository.save(i);
		
	}

}
