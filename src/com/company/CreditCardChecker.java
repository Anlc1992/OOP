package com.company;

import java.util.Scanner;

public class CreditCardChecker {
    public static void main(String[] args) {
        System.out.println("Enter credit card number:");
        long number = new Scanner(System.in).nextLong();
        if (isValid(number)){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number){
        int sum = sumOfOddPlace(number) + sumOfDoubleEvenPlace(number);
        if (sum%10 == 0){
            return true;
        }else {
            return false;
        }
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        String numberString = Long.toString(number);
        String secoundDigitFromRight = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (i%2 == 0){
                secoundDigitFromRight += "" + numberString.charAt(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < secoundDigitFromRight.length(); i++) {
            String temp = "" + (Character.getNumericValue(secoundDigitFromRight.charAt(i))*2);
            if (temp.length()>1){
                temp = "" + (Character.getNumericValue(temp.charAt(0)) + Character.getNumericValue(temp.charAt(1)));
            }
            sum += Character.getNumericValue(temp.charAt(0));
        }
        //System.out.println("even =" + sum);
        return sum;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        String numberString = Long.toString(number);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            if (i%2 == 1){
                sum += Character.getNumericValue(numberString.charAt(i));
            }
        }
        //System.out.println("odd =" + sum);
        return sum;
    }
}
