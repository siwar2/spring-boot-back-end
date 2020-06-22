package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.elearning.spring.models.Etudiant;
import com.elearning.spring.security.services.EtudiantService;
@RestController
@RequestMapping("/api/test2")
public class EtudiantRest {
	@Autowired
	
	private EtudiantService etudiantService ;
	
	@GetMapping("/allEtudiant")
	public List<Etudiant> getEtudiants (){
		return etudiantService.getAll() ;
		
	}
	
	@PutMapping("/addEtudiant")
	
	public void createEtudiant (@RequestBody  Etudiant e ) {
		this.etudiantService.addEtudiant(e);
	}
@DeleteMapping("/deleteEtudiant")
	
	public void deleteEtudiant (@RequestBody  Etudiant e ) {
		this.etudiantService.deleteEtudiant(e);
	}
@PostMapping("/updateEtudiant")

public void updateEtudiant (@RequestBody  Etudiant e ) {
	this.etudiantService.addEtudiant(e);
}

}
