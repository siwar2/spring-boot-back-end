package com.elearning.spring.security.services;

import java.util.List;

import com.elearning.spring.models.Admin;


public interface AdminService {
	List<Admin> getAll() ;
	void addAdmin(Admin  a);
	void deleteAdmin(Admin a);
	void updateAdmin (Admin a);
}
