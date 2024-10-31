package org.example;

import java.time.LocalDate;

public class SalesPerson extends  Employee{


    private String[] clients;
    private int aquiredClients;

    //Assuming a new Salesman can come with clients
    public SalesPerson(String name, LocalDate dateHired, String[] clients) {
        super(name, dateHired);
        this.clients = clients;
        this.aquiredClients = 0;
        calculateSalary();
        setId();
    }
    public SalesPerson(String name, LocalDate dateHired) {
        super(name, dateHired);
        this.clients = new String[0];
        this.aquiredClients = 0;
        calculateSalary();
        setId();
    }
    public void addClient(String client){
        String[] temp = new String[clients.length + 1];
        temp[temp.length - 1] = client;
        this.clients = temp;
        this.aquiredClients++;
        calculateSalary();
    }


    @Override
    public String toString(){
        return "SalesPerson: " + getName() + ", Id: " + getId() + ", hired: " + getDateHired() + ", salary: " + getSalary();
    }
    @Override
    public void calculateSalary() {
        double salary = 25000 + clients.length * 1000 + aquiredClients * 1500;
        setSalary(salary);
    }
}
