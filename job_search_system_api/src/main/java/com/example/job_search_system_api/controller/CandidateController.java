package com.example.job_search_system_api.controller;

import com.example.job_search_system_api.dto.IRecruitmentPageDto;
import com.example.job_search_system_api.service.ICandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/candidate")
public class CandidateController {
    @Autowired
    private ICandidateService candidateService;

    @GetMapping("/{username}")
    public ResponseEntity<Integer> getId(@PathVariable String username) {
        int id = candidateService.getIdCandidate(username);
        if (id==0) {
            return new ResponseEntity<>(0, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
