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

import com.elearning.spring.models.Matiere;
import com.elearning.spring.security.services.MatierService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/test")
public class MatierRest {
	
	
	@Autowired
	private MatierService matierService ;
	
	
	
		@GetMapping("/allMatiere")
		public List<Matiere> getMatiers (){
			return matierService.getAll() ;
			
		}
	
		@PutMapping("/addMatier")
		
		public void createMatier (@RequestBody  Matiere m ) {
			this.matierService.addMatiere(m);
		}
		
	
	   @DeleteMapping("/deleteMatier")
		
		public void deleteMatier (@RequestBody  Matiere m ) {
			this.matierService.deleteMatiere(m);
		}
	   
   
		@PostMapping("/updateMatier")
		
		public void updateMatier (@RequestBody  Matiere m ) {
			this.matierService.addMatiere(m);
		}

	
}
