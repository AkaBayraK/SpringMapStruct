package com.example.services;

import org.modelmapper.ModelMapper;

public class MyServiceImpl {
	
//    @Autowired
//    private final ModelMapper modelMapper;

    private final ModelMapper modelMapper;
    public MyServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


}
