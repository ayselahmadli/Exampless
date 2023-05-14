package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ebob_Ekok_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int number1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int number2 = scanner.nextInt();

        List<Integer> number1Bolenler = findBolenler(number1);
        List<Integer> number2Bolenler = findBolenler(number2);

        System.out.println("Birinci sayıyı bölen sayılar:");
        for (int bolen : number1Bolenler) {
            System.out.println(bolen);
        }

        System.out.println("İkinci sayıyı bölen sayılar:");
        for (int bolen : number2Bolenler) {
            System.out.println(bolen);
        }

        int ebob = findEbob(number1, number2);
        int ekok = findEkok(number1, number2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    // Bir sayıyı bölen tüm sayıları bulan fonksiyon
    public static List<Integer> findBolenler(int number) {
        List<Integer> bolenler = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                bolenler.add(i);
            }
        }
        return bolenler;
    }

    // İki sayının EBOB'unu bulan fonksiyon
    public static int findEbob(int number1, int number2) {
        int ebob = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
        }
        return ebob;
    }



    // İki sayının EKOK'unu bulan fonksiyon
    public static int findEkok(int number1, int number2) {
        int ekok = Math.max(number1, number2);
        for (int i = ekok; ; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                ekok = i;
                break;
            }
        }
        return ekok;
    }
}
