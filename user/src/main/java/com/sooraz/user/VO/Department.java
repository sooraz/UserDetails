package com.sooraz.user.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
private String departmentId;
private String departmentCode;
private String departmentName;
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(String departmentId) {
	this.departmentId = departmentId;
}
}
