package org.rb.student.Controller;

import org.rb.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;


    @RequestMapping("/")
    public String listStudent(Model model){
        model.addAttribute("list_student",service.getAllStudent());
        return "student";
    }
}
