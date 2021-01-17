package com.api.employee.bootrestemployee.controllers;

import java.util.List;

import com.api.employee.bootrestemployee.entities.Person;
import com.api.employee.bootrestemployee.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getPersons() {

        if (personService.findAll().isEmpty()) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } else {

            return new ResponseEntity<>(personService.findAll(), HttpStatus.FOUND);
        }

    }

    @GetMapping("/persons/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") int id) {
        try {
            if (personService.findById(id).equals(null)) {

                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {

                return new ResponseEntity<Person>(personService.findById(id), HttpStatus.FOUND);
            }
        } catch (Exception e) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @PostMapping("/persons")
    public ResponseEntity savePerson(@RequestBody Person person) {

        if (personService.savePerson(person) == true) {

            return new ResponseEntity<Person>(person, HttpStatus.CREATED);

        } else {

            return new ResponseEntity<>(HttpStatus.CONFLICT);

        }

    }

    @DeleteMapping("/persons/{id}")
    public ResponseEntity deleteById(@PathVariable("id") int id){

        if(personService.deletePersonById(id)==true){

            return new ResponseEntity<>(HttpStatus.OK);
        }else {

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }

    }

    @PutMapping("/persons/{id}")
    public ResponseEntity updatePerson(@RequestBody Person person, @PathVariable("id") int id){

        if(personService.updatePerson(person, id)==true){

            return new ResponseEntity<>(HttpStatus.OK);
        }else{

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}

