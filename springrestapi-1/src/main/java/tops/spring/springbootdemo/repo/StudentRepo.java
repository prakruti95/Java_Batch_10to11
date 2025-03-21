package tops.spring.springbootdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tops.spring.springbootdemo.model.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	
}
