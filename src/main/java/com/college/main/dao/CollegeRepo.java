package com.college.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.college.main.enteties.College;

@Repository
public interface CollegeRepo extends CrudRepository<College, Integer> {

}
