package sp.brother.mokitodemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sp.brother.mokitodemo.entity.StudentEntity;
import sp.brother.mokitodemo.exception.CustomException;
import sp.brother.mokitodemo.model.Student;
import sp.brother.mokitodemo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/studentlist")
	public List<Student> getStudentList() {
		List<Student> studentData=	studentService.getStudentList();
		return studentData;
		
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentEntity student) {
		if(student.getName().equals("")) {
			throw new CustomException(340,"waring","Name should not be empty");
		}
		
		studentService.save(student);
		return new String("Successfully save");
		
		
	}
}
