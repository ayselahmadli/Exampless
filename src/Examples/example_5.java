package Examples;

import java.util.Scanner;

public class example_5 {


            /* Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
            * (Check credit card number, if there aren’t 16 digit print
         * “Invalid credit card number”
            *
            * Input : John White 1234234534561478
            * Output : Name : J*** W****
            *          CCN  : **** **** **** 1478
            *  (Initials for name and surname should be uppercase)
            */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your surname");
        String surname = scanner.nextLine();

        System.out.println("Enter your card numbers");
        String number = scanner.nextLine();

        scanner.close();

        if(number.length() !=16){
            System.out.println("İnvalid card number - Card Number must be 16 digit");
        }
        else {
            String initials = name.substring(0,1).toUpperCase() + name.substring(1).replaceAll(".", "*")+"  ";
            String surnameInitials = surname.substring(0,1).toUpperCase() + surname.substring(1).replaceAll(".", "*")+"  ";

            String numberFormatted = "**** **** **** " + number.substring(12);

            // Print the formatted data
            System.out.println("Name: " + initials + " " + surnameInitials);
            System.out.println("CCN: " + numberFormatted);

        }
    }
}