package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.Institution;
import com.elearning.spring.models.Salle;


@RepositoryRestResource
@CrossOrigin("*")
public interface InstitutRepository   extends JpaRepository<Institution,Long>{
	@RestResource(path="/bynom")
	public List<Salle> findBynom (@Param("mc")String nom );

}
