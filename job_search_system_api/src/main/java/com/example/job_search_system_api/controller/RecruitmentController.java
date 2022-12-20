package com.example.job_search_system_api.controller;

import com.example.job_search_system_api.dto.IRecruitmentDto;
import com.example.job_search_system_api.dto.IRecruitmentPageDto;
import com.example.job_search_system_api.service.IRecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("api/recruitment")
public class RecruitmentController {

    @Autowired
    private IRecruitmentService recruitmentService;

    @GetMapping("")
    public ResponseEntity<Page<IRecruitmentPageDto>> getAll(@PageableDefault Pageable pageable){
        Page<IRecruitmentPageDto> recruitmentDtoPage = recruitmentService.searchRecruitment(pageable);
        if(recruitmentDtoPage.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(recruitmentDtoPage, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<IRecruitmentDto> getById(@PathVariable int id){
        Optional<IRecruitmentDto> recruitmentDto = recruitmentService.searchRecruitmentById(id);
        return recruitmentDto.map(iRecruitmentDto -> new ResponseEntity<>(iRecruitmentDto, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }
}
