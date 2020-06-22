package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Admin;
import com.elearning.spring.models.Enseignant;
import com.elearning.spring.models.Salle;
import com.elearning.spring.security.services.AdminService;
import com.elearning.spring.security.services.EnseignantService;
@RestController
@RequestMapping("api/test1")
public class AdminRest {

	@Autowired
	private AdminService adminService ;
	
	@GetMapping("/alladmin")
	public List<Admin> getAdmins (){
		return adminService.getAll() ;
		
	}
	
	@PutMapping("/addadmin")
	
	public void createAdmin(@RequestBody  Admin a ) {
		this.adminService.addAdmin(a);
			System.out.println("admin has been added succefully ");
	}
	
	@DeleteMapping("/deleteadmin")
	
	public void deleteAdmin (@RequestBody  Admin a ) {
		this.adminService.deleteAdmin(a);
	}
	
	@PostMapping("/updateadmin")
	
	public void updateAdmin (@RequestBody  Admin a ) {
		this.adminService.addAdmin(a);
	}


}
