package com.api.employee.bootrestemployee.services;

import java.util.List;
import java.util.Optional;

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

    public Candidate findById(int id) {

        if (candidateRepo.findById(id).isPresent()) {

            Optional<Candidate> cand = candidateRepo.findById(id);
            return cand.get();

        } else {
            return null;
        }

    }

    public List<Candidate> findAll() {

        return (List<Candidate>) candidateRepo.findAll();
    }

    public boolean deleteById(int id) {
        if (candidateRepo.findById(id).isPresent()) {

            candidateRepo.deleteById(id);
            return true;

        } else {

            return false;
        }
    }

    public boolean updateCandidate(Candidate candidate, int id) {

        if (candidateRepo.findById(id).isPresent()) {

            candidate.setId(id);
            candidateRepo.save(candidate);
            return true;

        } else {

            return false;
        }

    }

}
