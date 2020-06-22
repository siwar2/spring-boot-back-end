package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Enseignant;
import com.elearning.spring.repository.EnseignantRepository;
@Service
public class EnseignantServiceImp  implements EnseignantService{
	@Autowired
	private EnseignantRepository enseignantRepository ;
	@Override
	public List<Enseignant> getAll() {
	
		return enseignantRepository.findAll();
	}

	@Override
	public void addEnseignant(Enseignant ens) {
		this.enseignantRepository.save(ens);
		
	}

	@Override
	public void deleteEnseignant(Enseignant ens) {
		this.enseignantRepository.delete(ens);
		
	}

}
