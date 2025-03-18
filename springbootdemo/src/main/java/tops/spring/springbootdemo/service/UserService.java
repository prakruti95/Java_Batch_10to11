package tops.spring.springbootdemo.service;

import java.util.List;

import tops.spring.springbootdemo.model.User;

public interface UserService
{
	
	public void addorupdateuser(User u);
	public List<User> viewuser();
	public void deleteuser(int id);
	public User userbyid(int id);
	
	
}
