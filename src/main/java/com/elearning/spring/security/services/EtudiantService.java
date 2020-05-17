package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Etudiant;
import com.elearning.spring.repository.EtudiantRepository;

@RestController 
public class EtudiantService {
@Autowired
private EtudiantRepository etudiantRepository ;
@GetMapping("/listEtudiants")
public List<Etudiant> listEtudiant(){
	return etudiantRepository.findAll();
	
}

@GetMapping("/listEtudiants/{id}")
public Etudiant listEtudiant (@PathVariable(name="id")Long id){
	return etudiantRepository.findById(id).get();
	
}

@PutMapping("/listEtudiants/{id}")
public Etudiant update (@PathVariable(name="id")Long id,@RequestBody Etudiant e ){
	
	e.setId(id);
	return etudiantRepository.save(e);
	
}
@PostMapping("/listEtudiants")
public Etudiant save (@RequestBody Etudiant e ){
	

	return etudiantRepository.save(e);
	
} 
@DeleteMapping("/listEtudiants/{id}")
public void  delete (@PathVariable(name="id")Long id){
	
etudiantRepository.deleteById(id);
	
}


}
