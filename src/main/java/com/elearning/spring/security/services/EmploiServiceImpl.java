package com.elearning.spring.security.services;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Etudiant;
import com.elearning.spring.models.Seance;
import com.elearning.spring.security.dto.SeanceDto;
import  com.elearning.spring.security.services.EmploiService;
import com.elearning.spring.repository.SupportDeCoursRepository ;
import com.elearning.spring.repository.SeanceRepository;

@Service
public class EmploiServiceImpl implements EmploiService {
	@Autowired
    private SupportDeCoursRepository repository;

    @Autowired
    private SeanceRepository seanceRepository;
    @Autowired
    private Mapper mapper;

	@Override
	public void afficher(Integer id_Etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Seance> afficherEmploi(Etudiant e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeanceDto> afficherEmploiDto(Etudiant e) {
		 List<Seance> l = seanceRepository.query3(e.getId());

	        return l.stream().map(s -> mapper.map(s, SeanceDto.class)).collect(Collectors.toList());
	}


}
