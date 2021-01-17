package com.api.employee.bootrestemployee.repositories;

import com.api.employee.bootrestemployee.entities.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {

}
