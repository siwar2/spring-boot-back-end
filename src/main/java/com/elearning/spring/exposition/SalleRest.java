package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Salle;
import com.elearning.spring.security.services.SalleService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/test")
public class SalleRest {
	@Autowired
	private SalleService salleService ;
	@GetMapping("/allSalle")
	public List<Salle> getSalles (){
		return salleService.getAll() ;
		
	}
	
	@PutMapping("/addSalle")
	
	public void createSalle (@RequestBody  Salle s ) {
		this.salleService.addSalle(s);
			System.out.println("Salle has been added succefully ");
	}
	
	@DeleteMapping("/deleteSalle")
	
	public void deleteSalle (@RequestBody  Salle s ) {
		this.salleService.deleteSalle(s);
	}
	
	@PostMapping("/updateSalle")
	
	public void updateSalle (@RequestBody  Salle s ) {
		this.salleService.addSalle(s);
	}


}
