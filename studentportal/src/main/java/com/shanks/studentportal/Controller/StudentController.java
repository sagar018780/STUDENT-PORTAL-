package com.shanks.studentportal.Controller;

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

import com.shanks.studentportal.Service.Studentservice;
import com.shanks.studentportal.model.Student;

//http://localhost:1818/student
@RestController
@RequestMapping("/student")

public class StudentController {
	@Autowired
	Studentservice studentservice;

//	http://localhost:1818/student/upade/
	@RequestMapping("/update/{id}")
	@PutMapping
	Student updateStudentdata(@RequestBody Student c, @PathVariable Integer id) {
		return studentservice.updateage(c, id);

	}

//	http://localhost:1818/student/delete/id

	@DeleteMapping("/delete/{id}")
	String deletestudnet(@PathVariable Integer id) {
		studentservice.deleteOneStudentd(id);
		return "id no " + id + "deleted succesfully";

	}

//	http://localhost:1818/student/gets/email/email
	@GetMapping("/gets/email/{email}")
	Student getOneSbyEmail(@PathVariable String email) {
		return studentservice.findByEmail(email);
	}

//	http://localhost:1818/student/gets/sid
	@GetMapping("/gets/{sid}")
	Student getOneSinfo(@PathVariable Integer sid) {
		return studentservice.getOnestudentInfo(sid);
	}

//	 http://localhost:1818/student/getall
	@GetMapping("/getall")
	List<Student> getallinfo() {
		return studentservice.getAllStudentInfo();
	}

	// http://localhost:1818/student/wel
	@RequestMapping("/wel")
	String welcome() {
		return "welcome springboot world";
	}

	// http://localhost:1818/student/create
	@PostMapping
	@RequestMapping("/create")
	Student getStudentInfo(@RequestBody Student s) {
		return studentservice.createStudentData(s);
	}
}
