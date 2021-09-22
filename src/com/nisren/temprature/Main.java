package com.nisren.temprature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days temperature you want to calculate?");
        int numOfDays = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<=numOfDays; i++){
            System.out.println("Enter day "+i+"'s temperature: ");
            int temperature = scanner.nextInt();
            sum = sum + temperature;
//            sum+=temperature;
        }

        double average = sum / numOfDays;
        System.out.println();
        System.out.println("The Average temperature of the above mentioned days is: "+average);

    }
}
