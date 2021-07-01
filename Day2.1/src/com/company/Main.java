package com.company;

public class Main {

    public static void main(String[] args) {
        Employee emo = new Employee("Richie Rich",5000000);
        emo.getDetails();
        Employee owner = new Employee("Tony Kroos",9000000);
        owner.getDetails();
        owner.greet("Hello");

        //Overloading
        Overloading sh = new Overloading();
        sh.area("Richa");
        sh.area();
        sh.area(4,4);

        //Varargs
        Varargs varArg = new Varargs();
        varArg.findTotal("Richa");
        varArg.findTotal("Richa",12);
        varArg.findTotal("Richa",12,12);
        varArg.findTotal("Richa",12,12,12);
    }
}
