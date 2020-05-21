package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.elearning.spring.models.Etudiant;
import com.elearning.spring.security.services.EtudiantService;
@RestController
public class EtudiantRest {
	@Autowired
	private EtudiantService etudiantService ;
	
	@GetMapping("/all")
	public List<Etudiant> getEtudiants (){
		return etudiantService.getAll() ;
		
	}
	
	@PostMapping("/add")
	
	public void createEtudiant (@RequestBody  Etudiant e ) {
		this.etudiantService.addEtudiant(e);
	}

}
