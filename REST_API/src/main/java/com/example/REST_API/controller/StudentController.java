package com.example.REST_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.REST_API.entity.Student;
import com.example.REST_API.repo.StudentSpringDataJpa;
@RequestMapping
@RestController
public class StudentController
{
	@Autowired
	private StudentSpringDataJpa studentSpringDataJpa;
	
	
	@GetMapping("/display")
	public List<Student> getData() {
		return studentSpringDataJpa.findAll();
		
		
	
	}
	
	@PutMapping("/update/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody Student stu ){
		Student student = studentSpringDataJpa.findById((long)id).get();
		student.setAge(stu.getAge());
		student.setBranch(stu.getBranch());
		student.setCourses(stu.getCourses());
		student.setName(stu.getName());
		studentSpringDataJpa.save(stu);
		
		
	}
	@PostMapping("/insert")
	public void addStudent(@RequestBody Student stu) {
		
		studentSpringDataJpa.save(stu);
	}
	@DeleteMapping("/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		studentSpringDataJpa.deleteById((long) id);
		
	}
	
		
	
	
	

}
