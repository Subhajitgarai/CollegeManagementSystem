package com.college.main.service;

import org.springframework.stereotype.Service;

import com.college.main.enteties.College;
import com.college.main.enteties.Deparment;

@Service
public interface CollegeService {
	College addCollegeStudent(College college);
	Deparment addteacherviadept(Deparment deparment);

}
