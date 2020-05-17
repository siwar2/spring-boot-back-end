package com.elearning.spring.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Salle")
public class Salle implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Long id_Sa;
	@Column
	String reference;
	@Column
	Integer nb_places;
	@Column
	Boolean dataShow;
	public Long getId_Sa() {
		return id_Sa;
	}
	public void setId_Sa(Long id_Sa) {
		this.id_Sa = id_Sa;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Integer getNb_places() {
		return nb_places;
	}
	public void setNb_places(Integer nb_places) {
		this.nb_places = nb_places;
	}
	public Boolean getDataShow() {
		return dataShow;
	}
	public void setDataShow(Boolean dataShow) {
		this.dataShow = dataShow;
	}
	public Salle(Long id_Sa, String reference, Integer nb_places, Boolean dataShow) {
		super();
		this.id_Sa = id_Sa;
		this.reference = reference;
		this.nb_places = nb_places;
		this.dataShow = dataShow;
	}
	public Salle() {
		super();
	}

}