package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Salle;
import com.elearning.spring.security.services.SalleService;


@RestController
public class SalleRest {
	@Autowired
	private SalleService salleService ;
	@GetMapping("/allSalle")
	public List<Salle> getSalles (){
		return salleService.getAll() ;
		
	}
	
	@PostMapping("/addSalle")
	
	public void createSalle (@RequestBody  Salle s ) {
		this.salleService.addSalle(s);
	}

}
