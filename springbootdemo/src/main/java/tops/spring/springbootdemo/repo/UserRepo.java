package tops.spring.springbootdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tops.spring.springbootdemo.model.User;

public interface UserRepo extends JpaRepository<User,Integer>
{

}
