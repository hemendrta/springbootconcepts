package com.api.employee.bootrestemployee.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String email;
    private long mobile;

    @OneToOne(cascade = CascadeType.ALL) /*
                                          * This is required because when we try the persist the object of candidate it
                                          * requires the object of session and thus to ensure the same we are using this
                                          * so that we get it. .
                                          */
    private Session session;

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

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Candidate [email=" + email + ", id=" + id + ", mobile=" + mobile + ", name=" + name + ", session="
                + session + "]";
    }

}
