package tops.spring.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tops.spring.springbootdemo.model.Student;
import tops.spring.springbootdemo.service.StudentService;

@RestController
public class MyController 
{
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping("/")
	public String home()
	{
		return "hello";
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> viewStudent()
	{
		List<Student> all = studentService.viewAllStudent();
		return new ResponseEntity<List<Student>>(all,HttpStatus.OK); 
	}
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student std)
	{
		Student st = studentService.addStudent(std);
		
		return new ResponseEntity<Student>(st,HttpStatus.CREATED);
	}
	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable("id") int id)
	{
		studentService.deleteStudent(id);
		return "Student deleted";
	}
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> studentById(@PathVariable("id") int id)
	{
		Student std = studentService.StudentById(id);
		return new ResponseEntity<Student>(std,HttpStatus.OK);
	}
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s,@PathVariable("id") int id)
	{
		Student st = studentService.updateStudent(s, id);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
	}
}
