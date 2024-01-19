package com.college.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.main.enteties.College;
import com.college.main.enteties.Deparment;
import com.college.main.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/addcollge")
	public College addCollegeStudent(@RequestBody College college) {
		return collegeService.addCollegeStudent(college);
	}
	@PostMapping("/adddept")
	public Deparment addTecviaDept(@RequestBody Deparment deparment) {
		return collegeService.addteacherviadept(deparment);
		
	}

}
