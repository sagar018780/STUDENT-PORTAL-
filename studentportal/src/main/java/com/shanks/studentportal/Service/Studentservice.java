package com.shanks.studentportal.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shanks.studentportal.model.Student;

@Service
public interface Studentservice {

//creating or inserting  data into database
	Student createStudentData(Student s);

//	getting all the data from DB
	List<Student> getAllStudentInfo();

// getting one student data from DB
	Student getOnestudentInfo(Integer sid);

	// getting one student based on email from DB
	Student findByEmail(String email);

	// delete one student based on sid from D
	void deleteOneStudentd(Integer sid);

	// update data from data
	Student updateage(Student c, Integer id);
}
