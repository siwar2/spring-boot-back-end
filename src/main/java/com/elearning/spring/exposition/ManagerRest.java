package com.elearning.spring.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.spring.models.Manager;
import com.elearning.spring.security.services.ManagerService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class ManagerRest {
	@Autowired
	private ManagerService managerService ;
	@GetMapping("/allManagers")
	public List<Manager> getManagers (){
		return managerService.getAll() ;
		
	}
	
	@PutMapping("/addManager")
	
	public void createManager (@RequestBody  Manager g ) {
		this.managerService.addManager(g);
		System.out.println("Manager added");
	}
	@DeleteMapping("/deleteManager")
	public void deleteManager(@RequestBody Manager g) {
		this.managerService.deleteManager(g);
	}
	@PostMapping("/updateManager")
	public void updateManager(@RequestBody Manager g) {
		this.managerService.addManager(g);
	}

}
