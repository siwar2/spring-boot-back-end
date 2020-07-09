package com.elearning.spring.security.services;

import java.util.List;


import com.elearning.spring.models.Etudiant;
import com.elearning.spring.models.Groupe;
import com.elearning.spring.models.Seance;
import com.elearning.spring.security.dto.SeanceDto;


public interface EmploiService {
	  
    void afficher(Integer  id_Groupe);
    
    List<Seance> afficherEmploi(Groupe e);
    
    List<SeanceDto> afficherEmploiDto(Groupe e);

}
