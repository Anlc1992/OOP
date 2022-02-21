package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTest {
    public static void passwordTest(Scanner scanner) {
        while (true) {
            String password = scanner.nextLine();

            Pattern p = Pattern.compile("[^a-zA-Z0-9]");
            Matcher m = p.matcher(password);

            if(m.find()){
                System.out.println("Password må kun indeholde bogstaver og tal");
            } else if (password.length() < 5) {
                System.out.println("Password for kort");
            } else if (password.length() > 8) {
                System.out.println("Password for langt");
            } else {
                System.out.println("Password tilpas");
                break;
            }
        }
    }
}
