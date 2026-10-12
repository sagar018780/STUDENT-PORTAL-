package com.shanks.studentportal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shanks.studentportal.model.Student;
import com.shanks.studentportal.repo.Studentrepo;

@Repository
public class StudentServiceimpl implements Studentservice {
	@Autowired
	Studentrepo studentrepo;

	@Override
	public Student createStudentData(Student s) {
		return studentrepo.save(s);
	}

	@Override
	public List<Student> getAllStudentInfo() {
		return studentrepo.findAll();
	}

	@Override
	
	public Student getOnestudentInfo(Integer sid) {
		return studentrepo.findById(sid).get();
	}

	
	@Override
	public Student findByEmail( String email) {
		return studentrepo.findByEmail(email);
	}

	@Override
	public void deleteOneStudentd(Integer sid) {
		studentrepo.deleteById(sid);
		
	}

	@Override
	public Student updateage(Student c, Integer id) {
		Student studentfromdb=getOnestudentInfo(id);
		studentfromdb.setName(c.getName());
		studentfromdb.setAge(c.getAge());
		studentfromdb.setEmail(c.getEmail());
		studentfromdb.setPlace(c.getPlace());
		studentfromdb.setPhone(c.getPhone());
		
		return studentrepo.save(studentfromdb);
	}

	
}
