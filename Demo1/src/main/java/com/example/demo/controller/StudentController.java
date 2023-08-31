package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController // @RequestBody and @ResponseBody and @Controller
public class StudentController {

	@Autowired
	private StudentService stuSer;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
	
	Student stu1=stuSer.add(student);
	
	if(stu1!=null) {
		return "Data Inserted Successfully";
	}
	else
	{
		return "Something wrong";
	}
	
	}
	
	@RequestMapping("/getAll")
	public List<Student> findAllStudent()
	{		
		List<Student> students=stuSer.getAll();
		
		return students;
	}
}