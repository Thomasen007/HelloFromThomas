package Nielson;

import java.util.Scanner;

public class HelloThere {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        System.out.println("Hello, my name is Thomas. What is your name? ");
        String name = myObj.nextLine();
        System.out.println("Hello " + name +" nice to meet you.");
    }



}
