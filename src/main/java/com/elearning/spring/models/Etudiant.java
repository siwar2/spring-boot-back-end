package com.elearning.spring.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.elearning.spring.models.User;
import javax.persistence.JoinColumn;
import com.elearning.spring.models.Groupe;
@Entity
@Table(name="Etudiant")
public class Etudiant extends User {
	private String dernier_diplome ;
	 @ElementCollection(targetClass=Integer.class)
	private  List<Groupe> Groupe  =  new ArrayList<Groupe>();

	public String getDernier_diplome() {
		return dernier_diplome;
	}

	public void setDernier_diplome(String dernier_diplome) {
		this.dernier_diplome = dernier_diplome;
	}
   @ManyToMany
   @JoinTable(name="JOIN_ETUDIANT_GROUPE",
   joinColumns={@JoinColumn(name="id_Groupe")},
   inverseJoinColumns= {@JoinColumn(name="id")}
   
   )
   public List<Groupe> getGroupe() {
		return Groupe;
	}

	public void setGroupe(List<Groupe> Groupe) {
		this.Groupe = Groupe;
	}
	
	
	

}

