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

import com.elearning.spring.models.Institution;
import com.elearning.spring.models.Matiere;
import com.elearning.spring.security.services.InstitutService;
import com.elearning.spring.security.services.MatierService;
@RestController
@RequestMapping("api/test3")

public class InstitutRest {
	
		
		
		@Autowired
		private InstitutService institutService ;
		
		
		
			@GetMapping("/allinstitut")
			public List<Institution> getInstitutions (){
				return institutService.getAll() ;
				
			}
		
			@PutMapping("/addMatier")
			
			public void addInstitution (@RequestBody  Institution i) {
				this.institutService.addInstitution(i);
			}
			
		
		   @DeleteMapping("/deleteInstitution")
			
			public void deleteInstitution (@RequestBody  Institution i ) {
				this.institutService.deleteInstitution(i);
			}
		   
	   
			@PostMapping("/updateInstitution")
			
			public void updateInstitution (@RequestBody  Institution i ) {
				this.institutService.addInstitution(i);
			}

		
}
