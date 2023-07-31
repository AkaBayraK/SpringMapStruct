package com.example.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private long id;
    private long tcNumber;
    private String nameSurname;
    private String motherName;
    private String fatherName;
    private int age;
    private String schoolName;
    private String country;
    private String city;
    private String postalCode;
    private String schoolScore;
    private String healthNotes;
    private String teacherNotes;
}
