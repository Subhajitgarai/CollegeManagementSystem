package com.college.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.college.main.dao.CollegeRepo;
import com.college.main.dao.DepartmentRepo;
import com.college.main.enteties.College;
import com.college.main.enteties.Deparment;

@Component
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	CollegeRepo collegeRepo;
	@Autowired
	DepartmentRepo departmentRepo;
	
	public College addCollegeStudent(College college) {
		return collegeRepo.save(college);
	}
	//Adding Teacher via Department one to many
	public Deparment addteacherviadept(Deparment deparment) {
		return departmentRepo.save(deparment);
		
	}

}
