package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Groupe;
import com.elearning.spring.security.services.GroupeService;

@RestController
public class GroupeRest {
	@Autowired
	private GroupeService groupeService ;
	@GetMapping("/allGroupe")
	public List<Groupe> getGroupes (){
		return groupeService.getAll() ;
		
	}
	
	@PostMapping("/addGroupe")
	
	public void createGroupe (@RequestBody  Groupe g ) {
		this.groupeService.addGroupe(g);
	}

}
