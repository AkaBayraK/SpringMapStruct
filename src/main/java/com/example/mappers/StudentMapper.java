package com.example.mappers;

import org.mapstruct.Mapper;

import com.example.dto.StudentDto;
import com.example.entities.Student;


@Mapper(componentModel = "spring")
public interface StudentMapper {
	
    Student map(StudentDto studentDto);
    StudentDto map(Student student);

}
