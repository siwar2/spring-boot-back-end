package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Salle;

import com.elearning.spring.repository.SalleRepository;
@Service
public class SalleServiceImpl  implements SalleService{
	@Autowired
	private SalleRepository salleRepository ;

	@Override
	public List<Salle> getAll() {
		
		return salleRepository.findAll();
	}

	@Override
	public void addSalle(Salle s) {
		this.salleRepository.save(s);
		
	}

}
