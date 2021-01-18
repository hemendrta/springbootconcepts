package com.api.employee.bootrestemployee.repositories;

import com.api.employee.bootrestemployee.entities.Candidate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepo extends CrudRepository<Candidate,Integer>{
    
}
