package com.api.employee.bootrestemployee.services;

import java.util.ArrayList;
import java.util.List;

import com.api.employee.bootrestemployee.entities.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<Employee>();

    static {

        employees.add(new Employee(101, "Hemendra", "hemendra.singh.c@outlook.com", 7999996891l));
        employees.add(new Employee(102, "Nisha", "nisha.singh.c@outlook.com", 7999996890l));
        employees.add(new Employee(103, "Aditi", "aditi.singh.c@outlook.com", 7999996892l));
        employees.add(new Employee(104, "Subhash", "subhash.singh.c@outlook.com", 7999996893l));
    }

    public List<Employee> getEmployees() {

        return employees;

    }

    public Employee getEmployeeById(int id) {

        return employees.stream().filter(e -> e.getId() == id).findFirst().get();

    }

    public void deleteEmployee(int id) {

        employees.remove(employees.stream().filter(e -> e.getId() == id).findFirst().get());

    }

    public void addEmployee(Employee employee) {

        employees.add(employee);

    }

    public void updateEmployee(Employee employee, int id) {

        Employee employee2 = employees.stream().filter(e -> e.getId() == id).findFirst().get();
        employee2.setName(employee.getName());
        employee2.setEmail(employee.getEmail());
        employee2.setMobile(employee.getMobile());
    }

}
