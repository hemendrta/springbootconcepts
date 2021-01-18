package com.api.employee.bootrestemployee.controllers;

import com.api.employee.bootrestemployee.entities.Candidate;
import com.api.employee.bootrestemployee.services.CandidateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/candidates")
    public ResponseEntity<Candidate> saveCandidate(@RequestBody Candidate candidate) {

        if (candidateService.saveCandidate(candidate) == true) {

            return new ResponseEntity<>(candidate, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Candidate>(HttpStatus.CONFLICT);
        }

    }

}
