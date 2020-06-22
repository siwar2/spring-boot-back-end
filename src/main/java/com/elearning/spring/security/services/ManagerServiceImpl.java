package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Manager;
import com.elearning.spring.repository.ManagerRepository;

@Service
public class ManagerServiceImpl  implements ManagerService{
	@Autowired
	private ManagerRepository managerRepository ;
	@Override
	public List<Manager> getAll() {

		return managerRepository.findAll();
	}

	@Override
	public void addManager(Manager g) {
		this.managerRepository.save(g);
		
	}

	@Override
	public void deleteManager(Manager g) {
		this.managerRepository.delete(g);
		
	}	
}
