package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stuRepo;
	
	public Student add(Student student) {
		
		Student student1=stuRepo.save(student);
		return student1;
	}
	
	public List<Student> getAll(){
	List<Student> students=stuRepo.findAll();
	return students;
}
}