package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.dao.ExStudentDAO;
import com.springmvc.entity.ExStudent;

@Controller
//@RequestMapping("/student")
public class StudentController {

	//Inject the DAO
	@Autowired
	private ExStudentDAO exStudentDAO;
	
	@RequestMapping("/")
	public String welcome(){
		return "index";
	}
	
	@RequestMapping("/list")
	public String listExStudent(Model theModel){
		List<ExStudent> students= exStudentDAO.getStudent();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println(students);
		theModel.addAttribute("students", students);
		return "listStudent";
	}
}
