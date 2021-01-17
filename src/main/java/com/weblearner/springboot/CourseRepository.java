package com.weblearner.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weblearner.springboot.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{

}
