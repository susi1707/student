package org.rb.student.Service;

import org.rb.student.Entity.Student;
import org.rb.student.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;
    public List<Student> getAllStudent(){
        return repo.findAll();
    }
    public  Student saveStudent(Student student){
        return repo.save(student);
    }
    public Student editStudent(Long id){
        return repo.findById(id).get();
    }
    public  Student updateStudent(Student student){
        return repo.save(student);
    }
    public void deleteStudent(Long id){
        repo.deleteById(id);
    }
}
