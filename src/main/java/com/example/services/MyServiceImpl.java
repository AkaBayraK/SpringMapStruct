package com.example.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.StudentDto;
import com.example.entities.Student;

@Service
public class MyServiceImpl {
	
	@Autowired
	private ModelMapper modelMapper;
/*
    private final ModelMapper modelMapper;
    public MyServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
*/
	public StudentDto getProductById() {
		Student ent = new Student();
		ent.setId(1);
		ent.setNameSurname("Abdulkadir ALTUNBAYRAK");
		ent.setSchoolName("Higth School");
	
		return modelMapper.map(ent, StudentDto.class);
		
	}
	
}
