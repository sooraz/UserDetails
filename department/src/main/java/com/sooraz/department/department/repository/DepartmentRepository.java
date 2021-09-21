package com.sooraz.department.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sooraz.department.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{

	Department findByDepartmentId(int id);

	
}
