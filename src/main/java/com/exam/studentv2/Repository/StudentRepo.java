package com.exam.studentv2.Repository;

import com.exam.studentv2.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.print.attribute.IntegerSyntax;
import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;


public interface StudentRepo extends CrudRepository<Student, Integer> {
    public List<Student> findByAge(int age);

    @Transactional
    @Modifying
    @Query(value = "update student set age=:age where id=:id", nativeQuery = true)
    public void updateByAge(@Param("age") int age,@Param("id")  Integer id);
}
