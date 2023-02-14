package com.rud.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.rud.crud.Entity.Student;
import com.rud.crud.Repository.StudentRepository;

import jakarta.servlet.http.HttpSession;



@Controller
public class HomeController {
	@Autowired
	private StudentRepository Student_Repository;
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<Student> list =Student_Repository.findAll();
		
		
		System.err.println(list);
		m.addAttribute("list",list);
		//m.addAttribute("name","Samant");
		//m.addAttribute("lName", "sahani");
		
		return "index1";
	}
	@GetMapping("/load_form")
	public String loadForm()
	{
		return "add";
	}
	@GetMapping("/edit_form/{id}")
	public String editForm(@PathVariable(value="id") int id, Model m)
	{
		Optional<Student> student = Student_Repository.findById(id);
		Student stu = student.get();
		m.addAttribute("student", stu);
		return "update";
	}
	
	@PostMapping("/save_student")
	public String saveStudent(@ModelAttribute Student stud , HttpSession session) {
		Student_Repository.save(stud);
		session.setAttribute("msg", "students added successfully");
		
		return "redirect:/";
	}
	@PostMapping("/update_student")
	public String updatestudent(@ModelAttribute Student student, HttpSession session)
	{
		Student_Repository.save(student);
		session.setAttribute("msg", "students update successfully");
		return "redirect:/";
		
	}
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(value="id") int id, HttpSession session)
	{
		Student_Repository.deleteById(id);
		session.setAttribute("msg", "students delete successfully");
		return "redirect:/";
		
	}

}
