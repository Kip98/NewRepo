package com.practicals.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practicals.demo.model.Student;
import com.practicals.demorepository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
private StudentRepo studentRepository;
	
	public StudentServiceImpl(StudentRepo studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

	public StudentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
}
