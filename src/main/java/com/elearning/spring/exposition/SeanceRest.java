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
import com.elearning.spring.models.Seance;
import com.elearning.spring.security.services.SalleService;
import com.elearning.spring.security.services.SeanceService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/test")
public class SeanceRest {
	@Autowired
	private SeanceService seanceService ;
	@GetMapping("/allSeance")
	public List<Seance> getSeances (){
		return seanceService.getAll() ;
		
	}
	
	@PutMapping("/addSeance")
	
	public void createSalle (@RequestBody  Seance sc ) {
		this.seanceService.addSeance(sc);
			System.out.println("Seance has been added succefully ");
	}
	
	@DeleteMapping("/deleteSeance")
	
	public void deleteSeance (@RequestBody  Seance sc ) {
		this.seanceService.deleteSeance(sc);
	}
	
	@PostMapping("/updateSeance")
	
	public void updateSeance (@RequestBody  Seance sc ) {
		this.seanceService.addSeance(sc);
	}


}
