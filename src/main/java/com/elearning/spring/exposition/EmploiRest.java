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
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.security.services.EmploiService;

import com.elearning.spring.models.Etudiant;
import com.elearning.spring.models.Seance;


@RestController("/api/test")

@CrossOrigin(origins = "*")
public class EmploiRest {
	 
	   
	    @Autowired
	    private EmploiService service;
	   
	   

	    @GetMapping(value = "/emploi/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    ResponseEntity<?> getSeancesDto( @PathVariable Long id) {
	    	 Etudiant e = new Etudiant();
	        e.setId(id);
	        return new ResponseEntity<>( service.afficherEmploi(e), HttpStatus.OK);
	    }
}
