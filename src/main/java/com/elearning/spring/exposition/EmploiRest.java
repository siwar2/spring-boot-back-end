package com.elearning.spring.exposition;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.security.dto.SeanceDto;
import com.elearning.spring.security.services.EmploiService;

import com.elearning.spring.models.Etudiant;
import com.elearning.spring.models.Groupe;
import com.elearning.spring.models.Seance;


@RestController()
@RequestMapping("/api/test")
@CrossOrigin(origins = "*")
public class EmploiRest {
	 
	   
	    @Autowired
	    private EmploiService service;
	   
	   

	    @GetMapping(value = "/emploidto")
	    List<SeanceDto> getSeanceDto(){
	    	 Groupe e = new Groupe();
	        e.setId_Groupe( 1);
	        return  service.afficherEmploiDto(e) ;
	    }
}
