package co.com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.springboot.Entity.User;
import co.com.springboot.Repository.RoleRepository;
import co.com.springboot.Service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	RoleRepository rolesrepository;
	
	@GetMapping("/")
	private String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	private String userForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles", rolesrepository.findAll());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	
}
