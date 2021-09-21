package com.sooraz.department.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sooraz.department.department.entity.Department;
import com.sooraz.department.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService mDService;
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") int id) {
		System.out.println("sooraz id:: "+id);
		return mDService.getDepartmentById(id);
	}
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("sooraz ");
		return mDService.saveDepartment(department);
	}
}
