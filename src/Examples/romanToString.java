package Examples;

import java.util.Scanner;

public class romanToString {

    public static int romaRakaminiDonustur(String romaRakami) {
        int sayi = 0;

        for (int i = 0; i < romaRakami.length(); i++) {
            char currentChar = romaRakami.charAt(i);
            int currentValue = 0;

            switch (currentChar) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    System.out.println("Invalid Roman numeral!");
                    return 0;
            }

            if (i + 1 < romaRakami.length()) {
                char nextChar = romaRakami.charAt(i + 1);
                int nextValue = 0;

                switch (nextChar) {
                    case 'I':
                        nextValue = 1;
                        break;
                    case 'V':
                        nextValue = 5;
                        break;
                    case 'X':
                        nextValue = 10;
                        break;
                    case 'L':
                        nextValue = 50;
                        break;
                    case 'C':
                        nextValue = 100;
                        break;
                    case 'D':
                        nextValue = 500;
                        break;
                    case 'M':
                        nextValue = 1000;
                        break;
                    default:
                        System.out.println("Invalid Roman numeral!");
                        return 0;
                }

                if (currentValue < nextValue) {
                    sayi -= currentValue;
                } else {
                    sayi += currentValue;
                }
            } else {
                sayi += currentValue;
            }
        }

        return sayi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int integer = romaRakaminiDonustur(romanNumeral);
        System.out.println("Equivalent integer: " + integer);

        scanner.close();
    }
}
