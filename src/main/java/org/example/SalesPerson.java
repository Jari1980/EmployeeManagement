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
        System.arraycopy(clients, 0, temp, 0, clients.length);
        temp[temp.length - 1] = client;
        this.clients = temp;
        this.aquiredClients++;
        calculateSalary();
    }
    public void loseClient(String client){
        boolean existing = false;
        for(int i = 0; i < clients.length; i++){
            if(this.clients[i].equals(client)){
                existing = true;
            }
        }
        if(existing){
            this.aquiredClients--;
            String[] temp = new String[clients.length - 1];
            for(int i = 0, j = 0; i < clients.length; i++){
                if(!clients[i].equals(client)){
                    temp[j++] = clients[i];
                }
            }
            this.clients = temp;
        }
        else{
            System.out.println("There is no such customer");
        }

    }
    public void getClients(){
        for(String ele : clients){
            System.out.println(ele);
        }
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
