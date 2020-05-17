package com.elearning.spring.models;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.elearning.spring.models.Etudiant;
import java.util.Arrays;
import java.util.List;


@Entity
@Table(name="Groupe")
public class Groupe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column	
private Integer id_Groupe ;
	@Column
private  String nom  ;
@ElementCollection(targetClass=Integer.class)
private  List<Etudiant> etudiants =  new ArrayList<Etudiant>();

 public Integer getId_Groupe() {
	return id_Groupe;
}
public void setId_Groupe(Integer id_Groupe) {
	this.id_Groupe = id_Groupe;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
@ManyToMany 
@JoinTable(name="JOIN_ETUDIANT_GROUPE",
joinColumns={@JoinColumn(name="id")},
inverseJoinColumns= {@JoinColumn(name="id_Groupe")}

)
public List<Etudiant> getEtudiants() {
	return etudiants;
}
public void setEtudiants(List<Etudiant> etudiants) {
	this.etudiants = etudiants;
}


}
