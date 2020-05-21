package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.Groupe;
import com.elearning.spring.models.Matiere;

@RepositoryRestResource
@CrossOrigin("*")

public interface Matier extends JpaRepository<Matiere,Long>  {
	
	@RestResource(path="/bylibelle")
	public List<Matiere> findBylibelle (@Param("mc")String libelle );

}
