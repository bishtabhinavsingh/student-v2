package com.exam.studentv2.Services;

import com.exam.studentv2.Domain.Student;
import com.exam.studentv2.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> findByAge(int age){
        return studentRepo.findByAge(age);
    }

    public Student findById(Integer id){
        return studentRepo.findById(id).get();
    }

    public void updateByAge(int age, Integer id){
         studentRepo.updateByAge(age, id);
    }

    public Iterable<Student> findAllStudents() {return studentRepo.findAll(); }

    public void save(Student student){ studentRepo.save(student);}


}
