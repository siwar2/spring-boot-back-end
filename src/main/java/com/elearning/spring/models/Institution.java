package com.elearning.spring.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "institutions")
public class Institution {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Long id;
	@Column
	private String nom;
	@OneToMany(mappedBy = "institution")
	@Cascade(value = { CascadeType.DELETE, CascadeType.SAVE_UPDATE })
	private Collection<Admin> admins;
	@OneToMany(mappedBy = "institution")
	@Cascade(value = { CascadeType.DELETE, CascadeType.SAVE_UPDATE })
	private Collection<Manager> managers;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupes")
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(Collection<Admin> admins) {
		this.admins = admins;
	}
	public Collection<Manager> getManagers() {
		return managers;
	}
	public void setManagers(Collection<Manager> managers) {
		this.managers = managers;
	}
	public void addAdmin(Admin admin) {
		admins.add(admin);
		admin.setInstitution(this);
    }
 
    public void removeAdmin(Admin admin) {
    	admins.remove(admin);
    	admin.setInstitution(null);
    }
    public void addManager(Manager manager) {
		managers.add(manager);
		manager.setInstitution(this);
    }
 
    public void removeManager(Manager manager) {
    	managers.remove(manager);
    	manager.setInstitution(null);
    }
    public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public void addEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
		etudiant.getInstitutions().add(this);
	}

	public void removeEtudiant(Etudiant etudiant) {
		etudiants.remove(etudiant);
		etudiant.getGroupes().remove(this);
	}
}
