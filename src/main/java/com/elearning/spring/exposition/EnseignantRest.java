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

import com.elearning.spring.models.Enseignant;
import com.elearning.spring.security.services.EnseignantService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class EnseignantRest {
	@Autowired
	private EnseignantService enseignantService ;
	@GetMapping("/allEnseignants")
	public List<Enseignant> getEnseignants (){
		return enseignantService.getAll() ;
		
	}
	
	@PutMapping("/addEnseignant")
	
	public void createEnseignant (@RequestBody  Enseignant g ) {
		this.enseignantService.addEnseignant(g);
		System.out.println("Enseignant added");
	}
	@DeleteMapping("/deleteEnseignant")
	public void deleteEnseignant(@RequestBody Enseignant g) {
		this.enseignantService.deleteEnseignant(g);
	}
	@PostMapping("/updateEnseignant")
	public void updateEnseignant(@RequestBody Enseignant g) {
		this.enseignantService.addEnseignant(g);
	}
}
