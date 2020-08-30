package com.cognizant.tejas.carwash.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.tejas.carwash.model.User;
import com.cognizant.tejas.carwash.service.UserService;

@Controller
@SessionAttributes({"name","category"})

public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "")
	public String home() {

		return "home";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("user") User user) {
		return "userLogin";
	}

	@RequestMapping(value = "/userRegister", method = RequestMethod.GET)
	public String userRegistrationDisplay(@ModelAttribute("user") User userView) {

		return "userRegister";

	}

	@RequestMapping(value = "/userRegister", method = RequestMethod.POST)
	public String userRegistration(@ModelAttribute("user") User userReg, ModelMap model) {
		if (userService.addUser(userReg)) {
			model.put("status", "Registration Done SuccessFully");
		}

		else {
			model.put("status", "User Id is Already Exist");

		}

		return "userRegister";
	}

	@RequestMapping(value = "/userSuccessLogin", method = RequestMethod.GET)
	public String userLoginSucessDisplay(@ModelAttribute("user") User user) {
		return "userLoginSuccess";
	}

	@RequestMapping(value = "/userSuccessLogin", method = RequestMethod.POST)
	public String userLogin(HttpServletRequest request, @ModelAttribute("user") User user, BindingResult result,
			ModelMap model) {
		
		if(result.hasErrors())
		{
			return "userLogin";
		}
		
		List<User>userList = userService.read();
		for (User user1 :userList) 
		{
			if(user1.getUserId().equals(user.getUserId()) &&  user1.getPassword().equals(user.getPassword()))
			{model.put("name", user.getUserId());
			
			
			
			
			if(user1.getCategory().equals("T")) {
				model.put("catagory", user1.getCategory());
				return "cleanerLoginSuccess";
			}
			else {
				model.put("catagory", user1.getCategory());
				return "userLoginSuccess";
				
			}
			}
		}
		model.put("error" , "Wrong Credentials");
		
		return "userLogin";
		

	}

}
