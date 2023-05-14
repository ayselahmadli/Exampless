package Examples;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class happyNumbers {

    public static boolean isHappy(int number) {
        Set<Integer> visitedNumbers = new HashSet<>();

        while (number != 1) {
            if (visitedNumbers.contains(number)) {
                return false;  // Döngü oluştu, mutlu sayı değil
            }

            visitedNumbers.add(number);
            number = calculateDigitSquareSum(number);
        }

        return true;  // Mutlu sayı
    }

    public static int calculateDigitSquareSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        boolean isHappyNumber = isHappy(number);

        if (isHappyNumber) {
            System.out.println(number + " bir mutlu sayıdır.");
        } else {
            System.out.println(number + " bir mutlu sayı değildir.");
        }

        scanner.close();
    }
}
