package org.rb.student.Controller;

import org.rb.student.Entity.Student;
import org.rb.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;


    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public String listStudent(Model model){
        model.addAttribute("list_student",service.getAllStudent());
        return "student";
    }
    @RequestMapping(value = "new",method = RequestMethod.GET)
    public String createNewStudent(Model model){
        Student student= new Student();
        model.addAttribute("addstudent",student);
        return "addstudent";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String save(@ModelAttribute("student") Student student){
        service.saveStudent(student);
        return "redirect:/student";
    }
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String editStudent(@PathVariable Long id, Model model){
        model.addAttribute("editstudent",service.editStudent(id));
    return "editstudent";
    }
    @RequestMapping(value = "{id}",method = RequestMethod.POST)
    public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student){
        Student existingUser = service.editStudent(id);

        existingUser.setFirstName(student.getFirstName());
        existingUser.setLastName(student.getLastName());
        existingUser.setEmail(student.getEmail());
        service.updateStudent(existingUser);
        return "redirect:/student";
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
        return"redirect:/student";
    }
}
