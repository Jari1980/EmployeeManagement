package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Testing simple Systemdeveloper constructor and adding a certificate
        SystemDeveloper develop1 = new SystemDeveloper("Jari", LocalDate.of(2024,10,31));
        System.out.println(develop1);
        System.out.println("------------");
        develop1.addCertificate("Snus");
        System.out.println(develop1);
        System.out.println("-----------");

        //Testing constructor with developer with three known langugaes to start with
        String[] knownLanguages = new String[]{"Snus", "Pepsi", "Broccoli"};
        String[] certs = new String[0];
        SystemDeveloper develop2 = new SystemDeveloper("Jari", LocalDate.of(2023,10,31), certs, knownLanguages);
        System.out.println(develop2);
        System.out.println("-----------");


        //Testing SalesPerson
        SalesPerson sales1 = new SalesPerson("Jari", LocalDate.of(2024,10,31));
        System.out.println(sales1);
        sales1.addClient("Swedish Snus");
        System.out.println(sales1);
        System.out.println("------------------");

        //Testing new salesperson with two existing customers
        String[] cust = new String[]{"Broccoli", "Pepsi"};
        SalesPerson sales2 = new SalesPerson("Jari", LocalDate.of(2022,10,31), cust);
        System.out.println(sales2);
    }
}