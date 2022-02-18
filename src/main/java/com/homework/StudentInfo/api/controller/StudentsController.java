package com.homework.StudentInfo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.homework.StudentInfo.entities.concretes.Student;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.homework.StudentInfo.business.abstracts.StudentService;
import com.homework.StudentInfo.core.utilities.results.DataResult;
import com.homework.StudentInfo.core.utilities.results.Result;


@RestController
@RequestMapping("/api/students")
public class StudentsController {
	
	@Autowired
	private StudentService studentService;
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public StudentsController() {
		
	}
	
	@Autowired
	public StudentsController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Student>> getAll(){
		return this.studentService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Student student) {
		return this.studentService.add(student);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Student student) {
		return this.studentService.delete(student);
	}
	 
	
	@PutMapping("/update")
	public Result update(@RequestBody Student student) {
		return this.studentService.update(student);
		}
	
   }

