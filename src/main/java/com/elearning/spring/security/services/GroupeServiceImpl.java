package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Groupe;
import com.elearning.spring.repository.GroupeRepository;

@Service
public class GroupeServiceImpl  implements GroupeService{
	@Autowired
	private GroupeRepository groupeRepository ;
	@Override
	public List<Groupe> getAll() {

		return groupeRepository.findAll();
	}

	@Override
	public void addGroupe(Groupe g) {
		this.groupeRepository.save(g);
		
	}

	@Override
	public void deleteGroupe(Groupe g) {
		this.groupeRepository.delete(g);
		
	}	
}
