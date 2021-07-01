package com.company;

class EmployeeX {
    String name;
    double salary;
    public EmployeeX(String name,double salary) {
        this.name=name;
        this.salary=salary;
        System.out.println(name);
    }
    public void getDetails(){
        System.out.println(name);
        System.out.println(salary);
    }
}
class Manager extends EmployeeX{
    String city;

    // change the args and assign and check the out of manager class only
    public Manager(String name,double salary,String city) {
        super(name,salary);
        this.name=name+"X";
        this.salary=salary;
        this.city=city;
    }

    public void show(){
        System.out.println("City is "+city);
    }
}
public class InherDemo {
    public static void main(String[] args) {
        //EmployeeX employee = new EmployeeX();
        //employee.getDetails();
        Manager manager = new Manager("Richa",1200,"Bangalore");
        manager.getDetails();
        manager.show();

    }
}
