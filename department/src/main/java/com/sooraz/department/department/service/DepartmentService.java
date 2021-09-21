package com.sooraz.department.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooraz.department.department.entity.Department;
import com.sooraz.department.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository mDRepository;
	
	public Department getDepartmentById(int id) {
		return mDRepository.findByDepartmentId(id);
	}

	public Department saveDepartment(Department department) {
		return mDRepository.save(department);
	}
}
