package com.elearning.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.elearning.spring.models.SupportDeCours;

@RepositoryRestResource
@CrossOrigin("*")
public interface SupportDeCoursRepository  extends JpaRepository<SupportDeCours,Long> {

}
