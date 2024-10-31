package org.example;

import java.time.LocalDate;

public class SystemDeveloper extends  Employee{

    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(String name, LocalDate dateHired, String[] certificates, String[] languages) {
        super(name, dateHired);
        this.certificates = certificates;
        this.languages = languages;
        calculateSalary();
        setId();
    }
    public SystemDeveloper(String name, LocalDate dateHired, String[] certificates) {
        super(name, dateHired);
        this.certificates = certificates;
        this.languages = new String[0];
        calculateSalary();
        setId();
    }
    public SystemDeveloper(String name, LocalDate dateHired) {
        super(name, dateHired);
        this.certificates = new String[0];
        this.languages = new String[0];
        calculateSalary();
        setId();
    }

    public void addCertificate(String certificate){
        String[] temp = new String[certificates.length + 1];
        System.arraycopy(certificates, 0, temp, 0, certificates.length);
        temp[temp.length - 1] = certificate;
        this.certificates = temp;
        calculateSalary();
    }

    public void addLanguage(String language){
        String[] temp = new String[languages.length + 1];
        System.arraycopy(certificates, 0, temp, 0, certificates.length);
        temp[temp.length - 1] = language;
        this.languages = temp;
        calculateSalary();
    }

    @Override
    public String toString(){
        return "SystemDeveloper: " + getName() + ", Id: " + getId() + ", hired: " + getDateHired() + ", salary: " + getSalary();
    }

    @Override
    public void calculateSalary() {
        double salary = 25000 + certificates.length * 1000 + languages.length * 1500;
        setSalary(salary);
    }
}
