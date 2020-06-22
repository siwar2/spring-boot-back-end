package com.elearning.spring.models;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "groupes")
public class Groupe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id_Groupe;
	@Column
	private String nom;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupes")
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupes")
	private List<SupportDeCours> supportsDeCours = new ArrayList<SupportDeCours>();

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

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public void addEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
		etudiant.getGroupes().add(this);
	}

	public void removeEtudiant(Etudiant etudiant) {
		etudiants.remove(etudiant);
		etudiant.getGroupes().remove(this);
	}

	public List<SupportDeCours> getSupportsDeCours() {
		return supportsDeCours;
	}

	public void setSupportsDeCours(List<SupportDeCours> supportsDeCours) {
		this.supportsDeCours = supportsDeCours;
	}

	public void addSupportDeCours(SupportDeCours supportDeCours) {
		supportsDeCours.add(supportDeCours);
		supportDeCours.getGroupes().add(this);
	}

	public void removeSupportDeCours(SupportDeCours supportDeCours) {
		supportsDeCours.remove(supportDeCours);
		supportDeCours.getGroupes().remove(this);
	}

	public Groupe(String nom) {
		super();
		this.nom = nom;
	}
	public Groupe() {
		super();
	}

}
