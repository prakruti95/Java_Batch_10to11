package tops.spring.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tops.spring.springbootdemo.model.Student;
import tops.spring.springbootdemo.repo.StudentRepo;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addStudent(Student s) {
		
		return repo.save(s);
	}

	@Override
	public List<Student> viewAllStudent() {
	
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		
		repo.deleteById(id);		
	}

	@Override
	public Student StudentById(int id) {
		
		return repo.findById(id).orElseThrow();
	}

	@Override
	public Student updateStudent(Student s,int id) {
		
		s.setId(id);
		return repo.save(s);
	}

}
