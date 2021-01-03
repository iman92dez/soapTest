
package com.example.xml;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "student"
})
@XmlRootElement(name = "StudentDetailsResponse")
public class StudentDetailsResponse {

    @XmlElement(name = "Student", required = true)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student value) {
        this.student = value;
    }

}
