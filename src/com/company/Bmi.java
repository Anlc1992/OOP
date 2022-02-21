package com.company;

import java.util.Scanner;

public class Bmi {
    public static void bmi(Scanner scanner){
        System.out.println("Indtast vægt");
        float vægt = scanner.nextFloat();
        System.out.println("Indtast højde");
        float højde = scanner.nextFloat();
        float bmi = vægt/(højde*højde);
        System.out.format("Dit BMI er %.1f\n\r", bmi);

        if (bmi < 18.5){
            System.out.println("Du er undervægtig");
        }
        else if (bmi <= 25){
            System.out.println("Du er normalvægtig");
        }
        else if (bmi <=30){
            System.out.println("Du er overvægtig");
        }
        else if (bmi >30){
            System.out.println("Du er svært overvægtig");
        }
    }
}
