package com.example.crud.controller;


import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("student")
public class StudentController 
{
	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/test")
	public String test()
	{
		return "Hello Spring boot is working fine";
		
	}
	
	@GetMapping("/getAll")
	public List<StudentModel> getAll()
	{
		return studentRepo.findAll();
		
	}
	@PostMapping("/add")
	public List<StudentModel> addStudent(@RequestBody StudentModel stu)
	{
		studentRepo.save(stu);
		
		return studentRepo.findAll();
		
	}
	
	@PutMapping("/update")
	public List<StudentModel> updateStudent(@RequestBody StudentModel stu)
	{
		
		Optional<StudentModel> old_student=studentRepo.findById(stu.getId());
		
		StudentModel  student=old_student.get();
		
		student.setAge(stu.getAge());
		student.setName(stu.getName());
		studentRepo.save(student);
		
		return studentRepo.findAll();
		
	}
	//localhost:8080/
	//student
	///delete
	///3
	@DeleteMapping("/delete/{id}")
	public List<StudentModel> deleteStudent(@PathVariable long id)
	{
		
     Optional<StudentModel> old_student=studentRepo.findById(id);
		
		StudentModel  student=old_student.get();
		studentRepo.delete(student);
		
		return studentRepo.findAll();
    }
}
