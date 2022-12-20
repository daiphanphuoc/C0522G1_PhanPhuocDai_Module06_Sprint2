package com.example.job_search_system_api.controller;

import com.example.job_search_system_api.dto.CandidateRecruitmentDto;
import com.example.job_search_system_api.service.ICandidateRecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("api/candidate-recruitment")
public class CandidateRecruitmentController {
    @Autowired
    private ICandidateRecruitmentService candidateRecruitmentService;

    @PostMapping("create")
    public ResponseEntity<?> ungTuyen(@Valid @RequestBody CandidateRecruitmentDto candidateRecruitmentDto){
        candidateRecruitmentService.addRecruitment(candidateRecruitmentDto.getRecruitmentId(),
                candidateRecruitmentDto.getCandidateId());
        return new ResponseEntity(HttpStatus.OK);
    }

}
