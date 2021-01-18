package com.api.employee.bootrestemployee.repositories;

import com.api.employee.bootrestemployee.entities.Session;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepo extends CrudRepository<Session, Integer> {

}
