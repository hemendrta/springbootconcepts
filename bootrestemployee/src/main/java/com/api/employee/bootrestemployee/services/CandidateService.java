package com.api.employee.bootrestemployee.services;

import com.api.employee.bootrestemployee.entities.Candidate;
import com.api.employee.bootrestemployee.repositories.CandidateRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepo candidateRepo;

    public boolean saveCandidate(Candidate candidate) {

        if (candidateRepo.existsById(candidate.getId()) == true) {
            return false;
        } else {

            candidateRepo.save(candidate);
            return true;

        }

    }

}
