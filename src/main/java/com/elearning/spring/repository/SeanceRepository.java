package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.Etudiant;
import com.elearning.spring.models.Seance;
@Repository
@CrossOrigin("*")
public interface SeanceRepository  extends JpaRepository<Seance,Long>{
	@RestResource(path="/byType")
	public List<Seance> findByType(@Param("mc")String type );
}
