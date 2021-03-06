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

import com.elearning.spring.models.Groupe;
import com.elearning.spring.security.services.GroupeService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class GroupeRest {
	@Autowired
	private GroupeService groupeService ;
	@GetMapping("/allGroupe")
	public List<Groupe> getGroupes (){
		return groupeService.getAll() ;
		
	}
	
	@PutMapping("/addGroupe")
	
	public void createGroupe (@RequestBody  Groupe g ) {
		this.groupeService.addGroupe(g);
		System.out.println("Groupe added");
	}
	@DeleteMapping("/deleteGroupe")
	public void deleteGroupe(@RequestBody Groupe g) {
		this.groupeService.deleteGroupe(g);
	}
	@PostMapping("/updateGroupe")
	public void updateGroupe(@RequestBody Groupe g) {
		this.groupeService.addGroupe(g);
	}
}
