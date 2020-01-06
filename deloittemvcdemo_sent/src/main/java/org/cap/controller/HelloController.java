package org.cap.controller;

import javax.servlet.http.HttpSession;

import org.cap.service.IUserService;
import org.cap.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	private IUserService service;

	public IUserService getService() {
		return service;
	}

	@Autowired
	public void setService(IUserService service) {
		this.service = service;
	}
	
	@GetMapping("/input")
	public ModelAndView employeeInput() {
		return new ModelAndView("employeeinput");
	}

	@GetMapping("/employeedetails")
	public ModelAndView employeeDetails(@RequestParam("id") int id, @RequestParam("name") String name) {
		boolean correct = service.credentialsCorrect(id, name);
        System.out.println("id "+id +" "+"name "+name +"   "+correct);
		if (correct) {
			Employee employee = service.findById(id);
			ModelAndView mv = new ModelAndView("employeedetails", "employee", employee);
			return mv;
		} else {
			return new ModelAndView("employeeinput");
		}
	}
}
