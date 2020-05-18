package com.elearning.spring.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.elearning.spring.models.User;

@Entity
@Table(name = "Etudiant")
public class Etudiant extends User {
	private String dernier_diplome;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "etudiant_groupe", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "groupe_id"))
	private List<Groupe> groupes = new ArrayList<Groupe>();
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "etudiant_institution", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "institutions_id"))
	private List<Institution> institutions = new ArrayList<Institution>();

	public String getDernier_diplome() {
		return dernier_diplome;
	}

	public void setDernier_diplome(String dernier_diplome) {
		this.dernier_diplome = dernier_diplome;
	}

	public List<Groupe> getGroupes() {
		return this.groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public void addGroupe(Groupe groupe) {
		groupes.add(groupe);
		groupe.getEtudiants().add(this);
	}

	public void removeGroupe(Groupe groupe) {
		groupes.remove(groupe);
		groupe.getEtudiants().remove(this);
	}

	public List<Institution> getInstitutions() {
		return institutions;
	}

	public void setInstitutions(List<Institution> institutions) {
		this.institutions = institutions;
	}

}
