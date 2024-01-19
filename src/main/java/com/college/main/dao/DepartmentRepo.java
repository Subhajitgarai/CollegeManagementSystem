package com.college.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.college.main.enteties.Deparment;

public interface DepartmentRepo extends CrudRepository<Deparment, Integer> {

}
