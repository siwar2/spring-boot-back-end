package com.elearning.spring.security.services;
import java.util.List;

import com.elearning.spring.models.Etudiant;


public interface EtudiantService  {
List<Etudiant> getAll() ;
void addEtudiant(Etudiant  e);
void deleteEtudiant(Etudiant e);
void updateEtudiant (Etudiant e);
}
