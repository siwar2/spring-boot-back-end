package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.elearning.spring.models.Groupe;
@Repository
public interface GroupeRepository  extends JpaRepository<Groupe,Long>  {
	
	@RestResource(path="/bynomM")
	public List<Groupe> findBynom (@Param("mc")String nom );

}
