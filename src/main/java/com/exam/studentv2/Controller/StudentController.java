package com.exam.studentv2.Controller;

import com.exam.studentv2.Domain.Student;
import com.exam.studentv2.Repository.StudentRepo;
import com.exam.studentv2.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public Iterable<Student> findAllStudents(){ return studentService.findAllStudents();}
    @GetMapping("/studentage/{age}")
    public List<Student> getStudentByAge(@PathVariable int age){ return studentService.findByAge(age);}
    @GetMapping("/studentid/{id}")
    public Student getStudentById(@PathVariable Integer id){ return studentService.findById(id);}
    @PutMapping("/student/{id}/{age}")
    public void updateByAge(@PathVariable("age") Integer age, @PathVariable("id") Integer id) { studentService.updateByAge(age, id);}
    @PostMapping("/students")
    public void createStudent(@RequestBody Student student){ studentService.save(student);}
}
