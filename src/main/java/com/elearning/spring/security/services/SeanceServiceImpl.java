package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Seance;
import com.elearning.spring.repository.SalleRepository;
import com.elearning.spring.repository.SeanceRepository;
@Service
public class SeanceServiceImpl implements SeanceService {
	@Autowired
	private SeanceRepository seanceRepository ;
	@Override
	public List<Seance> getAll() {
		
		return seanceRepository.findAll();
	}

	@Override
	public void addSeance(Seance sc) {
		this.seanceRepository.save(sc);
		
	}

	@Override
	public void deleteSeance(Seance sc) {
	this.seanceRepository.delete(sc);
		
	}

	@Override
	public void updateSeance(Seance sc) {
		this.seanceRepository.save(sc);
		
	}

}
