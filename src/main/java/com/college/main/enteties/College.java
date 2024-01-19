package com.college.main.enteties;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	private int collegeId;
	private String collegeName;
	private String collegeAddress;
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Student.class)
	@JoinColumn(name = "college_id", referencedColumnName = "collegeId")
	private List<Student> students;
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Deparment.class)
	@JoinColumn(name = "college_id", referencedColumnName = "collegeId")
	private List<Deparment>department;
	
	public List<Deparment> getDepartment() {
		return department;
	}
	public void setDepartment(List<Deparment> department) {
		this.department = department;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	

}
