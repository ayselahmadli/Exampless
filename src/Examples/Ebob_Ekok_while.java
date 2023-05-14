package Examples;
import java.util.Scanner;
public class Ebob_Ekok_while {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Birinci sayıyı girin: ");
            int number1 = scanner.nextInt();

            System.out.print("İkinci sayıyı girin: ");
            int number2 = scanner.nextInt();

            int ebob = findEbob(number1, number2);
            int ekok = findEkok(number1, number2);

            System.out.println("EBOB: " + ebob);
            System.out.println("EKOK: " + ekok);
        }

        // İki sayının EBOB'unu bulan fonksiyon
        public static int findEbob(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // İki sayının EKOK'unu bulan fonksiyon
        public static int findEkok(int a, int b) {
            return (a * b) / findEbob(a, b);
        }
    }


