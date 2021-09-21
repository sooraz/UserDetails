package com.sooraz.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sooraz.user.VO.Department;
import com.sooraz.user.VO.ResponceTemplateVO;
import com.sooraz.user.entity.User;
import com.sooraz.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public ResponceTemplateVO getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("sooraz 2 id::"+id);
		ResponceTemplateVO data = new ResponceTemplateVO();
		User user = userRepository.findByUserId(id);
		data.setUser(user);
		Department department = restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(),Department.class);
		department.setDepartmentId(user.getDepartmentId());
		data.setDepartment(department);
		return data;
	}

}
