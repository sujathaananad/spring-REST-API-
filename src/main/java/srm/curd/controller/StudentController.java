package srm.curd.controller;

import java.util.List;


import org.hibernate.annotations.common.reflection.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import srm.curd.dao.StudentDAOImpl;
import srm.curd.model.Student;
import srm.curd.service.StudentServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@CrossOrigin(origins = "http://localhost:4200",maxAge = 4800, allowCredentials = "false")
@RestController
public class StudentController  {
	
		

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	/*** Creating a new Student ***/
@RequestMapping(value = "/create", method = RequestMethod.POST ) //, produces="application/json", consumes = "application/json")
	//@PostMapping(value = "/create") //, produces = "application/json", consumes = "application/json")
	
	public ResponseEntity<?> createStudent(@RequestBody Student student) {
		
		studentServiceImpl.createStudent(student);
		return ResponseEntity.ok().body("saved :" + student.toString());
		
//retur "{'status':'1'}";
//	return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	/*** Retrieve a single Student ***/
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET, produces = "application/json") //, produces = "application/json",
	 //Student
	public Student getStudentById(@PathVariable("id") long id) {
		Student student = studentServiceImpl.getStudentById(id);
		return student;
		//return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	/*** Retrieve all Students ***/
	@RequestMapping(value = "/students", produces = "application/json", method = RequestMethod.GET)
	public List getAllStudents() {
		List studentList = studentServiceImpl.getAllStudents();
		return studentList;
	}

	/*** Update a Student ***/
	@RequestMapping(value = "/update", method = RequestMethod.PUT) //, produces = "application/json", consumes = "application/json")
	public ResponseEntity<?> updateStudent(@RequestBody Student student) {
		studentServiceImpl.updateStudent(student);
		return ResponseEntity.ok().body("Updated :" + student.toString());
	}

	/*** Delete a Student ***/
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE) //, produces = "application/json")
	public ResponseEntity<?>  deleteStudent(@PathVariable("id") long id) {
		studentServiceImpl.deleteStudent(id);
	      return ResponseEntity.ok().body("User has been deleted successfully.");
	}
	
	/*** Delete a Student ***//*
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public void deleteStudent(@PathVariable("id") long id) {
		studentServiceImpl.deleteStudent(id);
	      //return ResponseEntity.ok().body("User has been deleted successfully.");
	}*/


}
