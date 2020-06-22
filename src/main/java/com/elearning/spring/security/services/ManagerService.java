package com.elearning.spring.security.services;

import java.util.List;

import com.elearning.spring.models.Manager;

public interface ManagerService {
	List<Manager> getAll() ;
	void addManager(Manager  g);
	void deleteManager(Manager g);
}
