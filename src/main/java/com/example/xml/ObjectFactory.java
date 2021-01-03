package com.example.xml;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public StudentDetailsResponse createStudentDetailsResponse() {
        return new StudentDetailsResponse();
    }

    public Student createStudent() {
        return new Student();
    }

    public StudentDetailsRequest createStudentDetailsRequest() {
        return new StudentDetailsRequest();
    }

}
