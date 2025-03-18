package tops.spring.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tops.spring.springbootdemo.model.User;
import tops.spring.springbootdemo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	UserRepo repo;
	
	@Override
	public void addorupdateuser(User u) 
	{
		
		repo.save(u);
	}

	@Override
	public List<User> viewuser() 
	{
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteuser(int id) 
	{
		repo.deleteById(id);
		
	}

	@Override
	public User userbyid(int id) 
	{
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

}
