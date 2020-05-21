package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Etudiant;
import com.elearning.spring.repository.EtudiantRepository;

@Service
public class EtudiantServiceImpl  implements EtudiantService{
		@Autowired
		private EtudiantRepository etudiantRepository ;

		@Override
		public List<Etudiant> getAll() {
			return etudiantRepository.findAll();
		}

		@Override
		public void addEtudiant(Etudiant e) {
			this.etudiantRepository.save(e);    
			}


}
