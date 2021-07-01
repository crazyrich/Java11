package com.company;

public class Overloading {
    void area(){
    System.out.println("No args");
}
    void area(int x,int y){
        System.out.println(x*y);
    }
    void area(String x){
        System.out.println(x);
    }
}
