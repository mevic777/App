package com.step.model;

public class Employee {
    private String name;
    private String surname;
    private int birthdate;

    public Employee() {
        this.name = null;
        this.surname = null;
        this.birthdate = 0;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }
}
