package com.elearning.spring.security.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.SupportDeCours;
import com.elearning.spring.repository.SupportDeCoursRepository;

@Service
public class SupportDeCoursServiceImpl implements SupportDeCoursService {

	@Autowired
	private SupportDeCoursRepository supportDeCoursRepository;
	@Override
	public List<SupportDeCours> getAll() {
		// TODO Auto-generated method stub
		return this.supportDeCoursRepository.findAll();
	}

	@Override
	public void addSupportDeCours(SupportDeCours g) {
		// TODO Auto-generated method stub
		this.supportDeCoursRepository.save(g);
	}

	@Override
	public void deleteSupportDeCours(SupportDeCours g) {
		// TODO Auto-generated method stub
		this.supportDeCoursRepository.delete(g);
	}
	
}
