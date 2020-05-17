package com.elearning.spring.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Matiere")
public class Matiere implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Long id_Ma;
	@Column
	String libelle;
	@Column
	Integer coefficient;
	public Long getId_Ma() {
		return id_Ma;
	}
	public void setId_Ma(Long id_Ma) {
		this.id_Ma = id_Ma;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Integer getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	public Matiere(Long id_Ma, String libelle, Integer coefficient) {
		super();
		this.id_Ma = id_Ma;
		this.libelle = libelle;
		this.coefficient = coefficient;
	}
	public Matiere() {
		super();
	}
	
}