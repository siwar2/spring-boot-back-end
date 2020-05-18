package com.elearning.spring.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SupportsDeCours")
public class SupportDeCours implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Long id;
	@Column
	String description;
	@Column
	String path;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "supportDeCours_groupe", 
		joinColumns = @JoinColumn(name = "id"), 
		inverseJoinColumns = @JoinColumn(name = "groupe_id"))
	private List<Groupe> groupes = new ArrayList<Groupe>();
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Ma")
    private Matiere matiere;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Ens")
    private Enseignant enseignant;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public List<Groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public void addGroupe(Groupe groupe) {
		groupes.add(groupe);
		groupe.getSupportsDeCours().add(this);
    }
 
    public void removeGroupe(Groupe groupe) {
    	groupes.remove(groupe);
    	groupe.getEtudiants().remove(this);
    }
}
