package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.Etudiant;
import com.elearning.spring.models.Seance;

@RepositoryRestResource
@CrossOrigin("*")
public interface SeanceRepository  extends JpaRepository<Seance,Long>{
	@RestResource(path="/byType")
	public List<Seance> findByType(@Param("mc")String type );
	
	 @Query( value = "SELECT * FROM `seance` ORDER BY jour, `heure_debut`", 
	            nativeQuery = true)
	    List<Seance> query1();
	    
	    // JPQL
	    @Query("select s from Seance s order by s.jour, s.heureDebut")
	    List<Seance> query2();
	 
	    
	    
	    // JPQL
	    @Query("select s from Seance s where s.enseignant.id=?1 order by s.jour, s.heureDebut")
	    List<Seance> query3(Long id);
	    
	
	
}
