package tops.spring.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tops.spring.springbootdemo.model.User;
import tops.spring.springbootdemo.service.UserService;

@Controller
public class MyController 
{
	
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String index(Model model)
	{
	
		model.addAttribute("user", new User());
		model.addAttribute("users", service.viewuser());
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/reg")
	public String insert(@ModelAttribute("user") User u,Model model)
	{
		if(u.getId()>0)
		{
			model.addAttribute("msg", "Update successfully !!!");
		}
		else
		{
			model.addAttribute("msg", "Registration successfully !!!");
		}
		
		service.addorupdateuser(u);
		model.addAttribute("user", new User());
		model.addAttribute("users", service.viewuser());
		return "index";
	}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("did") int id)
	{
		
		service.deleteuser(id);
		return "redirect:/";
	}
	
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("eid") int id,Model model)
	{
		
		User u = service.userbyid(id);
		model.addAttribute("user", u);
		model.addAttribute("users", service.viewuser());
		
		return "index";
	}
	
	
	
}
