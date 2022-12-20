package com.example.job_search_system_api_v1.controller;

import com.example.job_search_system_api_v1.dto.IEmployerDto;
import com.example.job_search_system_api_v1.repository.IEmployerRepository;
import com.example.job_search_system_api_v1.service.IEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("employer")
@CrossOrigin("*")
public class EmployerController {

    @Autowired
    private IEmployerService employerService;

    @GetMapping("")
    public ResponseEntity getAllEmployer(@PageableDefault(value = 5) Pageable pageable){
        Page<IEmployerDto> listEmployer = employerService.getAll(pageable);
        return new ResponseEntity(listEmployer, HttpStatus.OK);
    }
}
