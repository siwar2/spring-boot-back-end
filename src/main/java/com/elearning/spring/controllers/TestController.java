package com.elearning.spring.controllers;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/student")
	@PreAuthorize("hasRole('STUDENT')")
	public String studentAccess() {
		return "Student Content.";
	}
	@GetMapping("/teacher")
	@PreAuthorize("hasRole('TEACHER')")
	public String teacherAccess() {
		return "Teacher Content.";
	}

	@GetMapping("/manager")
	@PreAuthorize("hasRole('MANAGER')")
	public String moderatorAccess() {
		return "Manager Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	@GetMapping("/root")
	@PreAuthorize("hasRole('ROOT')")
	public String rootAccess() {
		return "Root Board.";
	}
}
