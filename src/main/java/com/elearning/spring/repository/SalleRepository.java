package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.elearning.spring.models.Groupe;
import com.elearning.spring.models.Salle;

public interface SalleRepository extends JpaRepository<Salle,Long>  {
	
	@RestResource(path="/byreference")
	public List<Salle> findByreference (@Param("mc")String reference );

}
