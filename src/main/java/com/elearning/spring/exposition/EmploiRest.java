package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.security.dto.SeanceDto;
import com.elearning.spring.security.services.EmploiService;

import com.elearning.spring.models.Groupe;
import com.elearning.spring.repository.GroupeRepository;



@RestController()
@RequestMapping("/api/test/emploi")
@CrossOrigin(origins = "*")
public class EmploiRest {
	 
	   
	    @Autowired
	    private EmploiService emploiService;
	    @Autowired
	    private GroupeRepository groupeRepo;
	    @GetMapping("/{id}")
	   public List<SeanceDto> getSeanceDto(@PathVariable Long id){
	    	Groupe g = new Groupe();
	        g = groupeRepo.getOne(id);
	        return  emploiService.afficherEmploiDto(g) ;
	    }
}
