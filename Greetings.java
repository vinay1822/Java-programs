package com.vinay;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.next();
        System.out.println(name + ", Welcome to my space!!!");
    }
}
