package com.company;

public class Employee {
    String name;
    double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    void getDetails(){
        System.out.println(name);
        System.out.println(salary);

    }
    void greet(String message){
        System.out.println(message);
    }

}
