package com.api.employee.bootrestemployee.controllers;

import java.util.List;

import com.api.employee.bootrestemployee.entities.Employee;
import com.api.employee.bootrestemployee.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// In case of the controllers we have to specify explicitly the content type using the responsebody annotation.With Restcontroller annotation we need not use the responsebody annotation.

/* Status Codes */
/* 
201: Creation
200: Fetch/Get/Read
200: Update
204: Delete
200/204/206: Fetch All Records

 */
// @Controller
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/message")
    // @ResponseBody
    public String getMessageString() {

        return "Employee Name : Hemendra Singh Chouhan";

    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {

        return employeeService.getEmployees();

    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {

        return employeeService.getEmployeeById(id);

    }

    @DeleteMapping("/employees/{id}")
    public List<Employee> deleteEmployee(@PathVariable("id") int id) {

        employeeService.deleteEmployee(id);
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public List<Employee> addEmployee(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
        return employeeService.getEmployees();
    }

    @PutMapping("/employees/{id}")
    public List<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {

        employeeService.updateEmployee(employee, id);
        return employeeService.getEmployees();

    }

}
