package com.api.employee.bootrestemployee.services;

import java.util.List;
import java.util.Optional;

import com.api.employee.bootrestemployee.entities.Person;
import com.api.employee.bootrestemployee.repositories.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public boolean savePerson(Person person) {

        if (personRepo.existsById(person.getId()) == false) {

            personRepo.save(person);
            return true;

        } else {
            return false;
        }

    }

    public Person findById(int id) {

        if (personRepo.existsById(id) == true) {

            Optional<Person> person = personRepo.findById(id);
            Person person2 = person.get();
            return person2;
        } else {
            return null;
        }
    }

    public List<Person> findAll() {

        return (List<Person>) personRepo.findAll();

    }

    public boolean deletePersonById(int id) {

        if (personRepo.existsById(id) == true) {

            personRepo.deleteById(id);
            return true;

        } else {

            return false;
        }

    }

    public boolean updatePerson(Person person, int id) {

        if (personRepo.existsById(id) == true) {

            person.setId(id);
            personRepo.save(person);
            return true;
        } else {

            return false;
        }

    }
}
