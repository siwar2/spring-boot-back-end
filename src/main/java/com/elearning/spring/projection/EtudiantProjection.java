package com.elearning.spring.projection;

import org.springframework.data.rest.core.config.Projection;

import com.elearning.spring.models.Etudiant;

@Projection(name="et" ,types=Etudiant.class)
public interface EtudiantProjection {
public String getDernier_diplome();
}
