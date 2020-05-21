package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.Enseignant;
import com.elearning.spring.models.Etudiant;

@RepositoryRestResource
@CrossOrigin("*")

public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
	@RestResource(path="/byUsernameE")
	public List<Enseignant> findByUsername(@Param("mc")String username );
}
