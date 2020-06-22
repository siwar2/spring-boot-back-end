package com.elearning.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.Manager;


@RepositoryRestResource
@CrossOrigin("*")
public interface ManagerRepository extends JpaRepository<Manager,Long>  {
	
	@RestResource(path="/bynomM")
	public List<Manager> findByusername (@Param("mc")String username );
}
