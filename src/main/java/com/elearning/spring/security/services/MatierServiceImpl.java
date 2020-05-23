package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Matiere;
import com.elearning.spring.repository.MatierRepository;

@Service
public class MatierServiceImpl  implements  MatierService{
	@Autowired
	private  MatierRepository  matierRepository ;

	@Override
	public List<Matiere> getAll() {
		
		return matierRepository.findAll();
	}

	@Override
	public void addMatiere(Matiere m) {
		this.matierRepository.save(m);
		
	}

}
