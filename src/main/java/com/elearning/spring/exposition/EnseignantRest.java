package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Enseignant;

import com.elearning.spring.security.services.EnseignantService;


@RestController
public class EnseignantRest {
	@Autowired
	private EnseignantService enseignantService ;
	@GetMapping("/allEnseigant")
	public List<Enseignant> getEnseignants (){
		return enseignantService.getAll() ;
		
	}
	
	@PostMapping("/addEnseignant")
	
	public void createEnseiganat (@RequestBody  Enseignant ens ) {
		this.enseignantService.addEnseignant(ens);
	}
}
