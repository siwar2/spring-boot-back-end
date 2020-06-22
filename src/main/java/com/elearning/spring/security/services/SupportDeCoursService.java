package com.elearning.spring.security.services;

import java.util.List;

import com.elearning.spring.models.SupportDeCours;

public interface SupportDeCoursService {
	List<SupportDeCours> getAll() ;
	void addSupportDeCours(SupportDeCours  g);
	void deleteSupportDeCours(SupportDeCours g);
}
