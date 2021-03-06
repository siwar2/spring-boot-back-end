package com.elearning.spring.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="managers")
public class Manager extends User {
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_institution")

    private Institution institution;
@JsonIgnore 
	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

}
