package com.api.employee.bootrestemployee.entities;

public class Employee {

    private int id;
    private String name;
    private String email;
    private Long mobile;

    public Employee(int id, String name, String email, Long mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee [email=" + email + ", id=" + id + ", mobile=" + mobile + ", name=" + name + "]";
    }

}
