package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

import com.example.xml.Student;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class StudentRepository {
    private static final Map<String, Student> students = new HashMap<>();

    @PostConstruct
    public void initData() {

        Student student1 = new Student();
        student1.setStandard(1);
        student1.setName("iman");
        student1.setAddress("tehran");
        students.put(student1.getName(), student1);

        Student student2 = new Student();
        student2.setStandard(2);
        student2.setName("ali");
        student2.setAddress("dezful");
        students.put(student2.getName(), student2);
    }

    public Student findStudent(String name)
    {
        Assert.notNull(name, "The Student's name must not be null");
        return students.get(name);
    }
}