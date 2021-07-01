package com.company;

import java.util.Scanner;

class Archiever{

    void compressFile(String fileName){
        System.out.println("Class Archiever:" + fileName);
    }
}
class ZipArchiever extends Archiever{

    void compressFile(String fileName){
        System.out.println("Class Zip-Archiever"+ fileName);
    }
}
class RarArchiever extends Archiever{
    void compressFile(String fileName){
        System.out.println("Class Rar-Archiever"+ fileName);
    }
}
public class Self_Archiever_Inheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        String name = sc.nextLine();
        if(type == 1){
            ZipArchiever zip1 = new ZipArchiever();
            zip1 .compressFile(name);
            //
            Archiever zip4 = new ZipArchiever();
            zip4 .compressFile(name);
        }else if(type == 2){
            RarArchiever zip2 = new RarArchiever();
            zip2 .compressFile(name);
        }else{
            Archiever zip3 = new Archiever();
            zip3 .compressFile(name);
        }
    }
}
