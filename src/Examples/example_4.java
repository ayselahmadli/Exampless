package Examples;

import java.util.Scanner;

public class example_4 {

    /*
     * Ask the user for a String and a sentences
     * Find and print occurrence of String in sentences.
     * (without case sensitivity)
     *
     * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
     * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
     */

       public static void main(String[] args) {
            // Kullanıcıdan string ve cümle girişini isteyin
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter string : ");
            String searchString = scanner.nextLine();
            System.out.print("Enter sentences: ");
            String sentence = scanner.nextLine();
            scanner.close();

            // Stringin cümle içinde kaç kez geçtiğini bulun
            int sayi = 0;
            int index = sentence.indexOf(searchString);
            while (index != -1) {
                sayi++;
                index = sentence.indexOf(searchString, index + 1);
            }

            // Sonuçları yazdırın
            System.out.println("String '" + searchString + "', cümlede " + sayi + " kez bulundu.");
        }
    }





