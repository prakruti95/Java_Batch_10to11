package tops.spring.springbootdemo.service;



import java.util.List;

import tops.spring.springbootdemo.model.Student;


public interface StudentService 
{
		public Student addStudent(Student s);
		public List<Student> viewAllStudent();
		public void deleteStudent(int id);
		public Student StudentById(int id);
		public Student updateStudent(Student s,int id);
}
