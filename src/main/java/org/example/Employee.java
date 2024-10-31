package org.example;

import java.time.LocalDate;

public abstract class Employee {
    private static int counter = 1;
    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    public Employee(String name, LocalDate dateHired) {
        this.name = name;
        this.dateHired = dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setId() {
        this.id = counter++;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void calculateSalary();
}
