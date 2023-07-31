package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ProductDTO;
import com.example.dto.StudentDto;
import com.example.entities.Student;
import com.example.mappers.StudentMapper;
import com.example.services.MyServiceImpl;
import com.example.services.ProductServiceImpl;


@RestController
public class SpringMapperController {
	
	
    private final StudentMapper studentMapper;
    private final ProductServiceImpl productServiceImpl;
    private final MyServiceImpl myServiceImpl;

    public SpringMapperController(StudentMapper studentMapper, ProductServiceImpl productServiceImpl, MyServiceImpl myServiceImpl) {
        this.studentMapper = studentMapper;
        this.productServiceImpl = productServiceImpl;
        this.myServiceImpl = myServiceImpl;
    }
    
    @GetMapping("/student")
    public ResponseEntity<StudentDto> getStudentDto() {
        Student student = new Student();
        student.setAge(18);
        student.setCity("Antalya");
        student.setFatherName("Ahmet");
        student.setMotherName("Ayse");
        student.setHealthNotes("Saglikli");
        student.setTcNumber(123456L);
        student.setTeacherNotes("Caliskan");
        student.setSchoolScore("76");
        student.setPostalCode("95014");
        student.setNameSurname("Mehmet");
        student.setId(1L);
        student.setSchoolName("Java School");
        
        StudentDto studentDto = studentMapper.map(student);

        return ResponseEntity.ok(studentDto);
    }
    
    @GetMapping("/product")
    public ResponseEntity<ProductDTO> getProductDTO() {
    	
    	ProductDTO productDto = productServiceImpl.getProductById(1);

        return ResponseEntity.ok(productDto);
    }
    
    @GetMapping("/modelMapperProduct")
    public ResponseEntity<StudentDto> getModelMapperStudentDTO() {
    	
    	StudentDto dto = myServiceImpl.getProductById();

        return ResponseEntity.ok(dto);
    }
}