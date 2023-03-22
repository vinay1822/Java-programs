package com.vinay;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount:");
        int P = input.nextInt();
        System.out.print("Enter Rate of Interest:");
        float R = input.nextFloat();
        System.out.print("Enter the period of time");
        float T = input.nextFloat();

        float final_amount = (P*R*T)/100;
        System.out.println("Simple interest is " + final_amount + " Rupees");
    }
}
