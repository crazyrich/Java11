package com.company;

public class Varargs {
    void findTotal(String s, int... marks){
        int sum=0;
for(int m:marks){
    sum+=m;

}
        System.out.println(sum);
    }

    void findTotal(String name){
        System.out.println("Welcome "+name);
    }
}
