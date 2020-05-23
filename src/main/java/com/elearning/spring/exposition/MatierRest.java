package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Matiere;
import com.elearning.spring.security.services.MatierService;

@RestController
public class MatierRest {
	@Autowired
	private MatierService matierService ;
	@GetMapping("/allMatiere")
	public List<Matiere> getMatiers (){
		return matierService.getAll() ;
		
	}
	
	@PostMapping("/addMatier")
	
	public void createMatier (@RequestBody  Matiere m ) {
		this.matierService.addMatiere(m);
	}

	
}
