package com.in28mins.springboot.springbootdemoapp.repository;

import com.in28mins.springboot.springbootdemoapp.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
