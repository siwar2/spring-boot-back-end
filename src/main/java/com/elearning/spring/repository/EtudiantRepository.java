package com.elearning.spring.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.Etudiant;
@Repository
@CrossOrigin("*")
public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
	@RestResource(path="/byUsername")
  public List<Etudiant> findByUsername(@Param("mc")String username );
	/*@RestResource(path="/byUsernamePage")
  public Page<Etudiant> findByUsername(@Param("mc")String username , Pageable pageable);
  */
}
