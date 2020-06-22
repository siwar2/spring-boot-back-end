package com.elearning.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.spring.models.Admin;
import com.elearning.spring.repository.AdminRepository;
import com.elearning.spring.repository.EnseignantRepository;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository ;
	@Override
	public List<Admin> getAll() {
		
		return adminRepository.findAll();
	}

	@Override
	public void addAdmin(Admin a) {
		this.adminRepository.save(a);
		
	}

	@Override
	public void deleteAdmin(Admin a) {
		this.adminRepository.delete(a);
		
	}

	@Override
	public void updateAdmin(Admin a) {
		this.adminRepository.save(a);
		
	}

}
