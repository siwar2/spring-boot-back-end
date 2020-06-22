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

import com.elearning.spring.models.SupportDeCours;
import com.elearning.spring.security.services.SupportDeCoursService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class SupportDeCoursRest {
	@Autowired
	private SupportDeCoursService supportDeCoursService ;
	@GetMapping("/allSupportDeCourss")
	public List<SupportDeCours> getSupportDeCourss (){
		return supportDeCoursService.getAll() ;
		
	}
	
	@PutMapping("/addSupportDeCours")
	
	public void createSupportDeCours (@RequestBody  SupportDeCours g ) {
		this.supportDeCoursService.addSupportDeCours(g);
		System.out.println("SupportDeCours added");
	}
	@DeleteMapping("/deleteSupportDeCours")
	public void deleteSupportDeCours(@RequestBody SupportDeCours g) {
		this.supportDeCoursService.deleteSupportDeCours(g);
	}
	@PostMapping("/updateSupportDeCours")
	public void updateSupportDeCours(@RequestBody SupportDeCours g) {
		this.supportDeCoursService.addSupportDeCours(g);
	}
}
