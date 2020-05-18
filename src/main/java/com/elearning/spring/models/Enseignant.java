package com.elearning.spring.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="Enseignant")
public class Enseignant extends User {
	
	private String specialité ;
	private String diplome ;
	
	@OneToMany(mappedBy="enseignant", fetch = FetchType.EAGER)
	@Cascade(value = { CascadeType.DELETE, CascadeType.SAVE_UPDATE })
	private Collection<Seance> seances;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "enseignant_institution", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "institutions_id"))
	private List<Institution> institutions = new ArrayList<Institution>();

	
	
	
	public List<Institution> getInstitutions() {
		return institutions;
	}



	public void setInstitutions(List<Institution> institutions) {
		this.institutions = institutions;
	}



	public List<Seance> getSeances() {
		//Collections.sort((List <Seance>)seances,new SeanceComparator());
		return (List <Seance>)this.seances;
	}



	public String getSpecialité() {
		return specialité;
	}



	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}



	public String getDiplome() {
		return diplome;
	}



	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}



	public void setSeances(Collection<Seance> seances) {
		this.seances = seances;
	}



	public Enseignant() {
	
	}



	public Enseignant(String username, String email, String password) {
		
	}



	public Enseignant(String specialité, String diplome, Collection<Seance> seances) {
		super();
		this.specialité = specialité;
		this.diplome = diplome;
		this.seances = seances;
	}



	

}

