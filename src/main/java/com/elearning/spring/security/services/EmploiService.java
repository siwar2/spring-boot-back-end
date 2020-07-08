package com.elearning.spring.security.services;

import java.util.List;


import com.elearning.spring.models.Etudiant;
import com.elearning.spring.models.Seance;
import com.elearning.spring.security.dto.SeanceDto;


public interface EmploiService {
	  
    void afficher(Integer  id_Etudiant);
    
    List<Seance> afficherEmploi(Etudiant e);
    
    List<SeanceDto> afficherEmploiDto(Etudiant e);

}
