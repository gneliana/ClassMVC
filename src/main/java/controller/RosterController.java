package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import model.StudentClass;

@RestController
public class RosterController {
	
	List<StudentClass> students = new ArrayList<StudentClass>();
	

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/Student")
	public StudentClass postStudentClass(@Valid @RequestBody StudentClass studentClass) {
		students.add(studentClass);
		return studentClass;
		
	}
	
	@ResponseStatus (HttpStatus.OK)
	@GetMapping(value = "/Student")
	public List<StudentClass> getstudentClass() {
	return students;
	}
}