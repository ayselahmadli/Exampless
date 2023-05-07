package Examples;

import java.util.Scanner;

public class examle_7 {

    /*
     * Ask the user for a String and a sentences
     * Find and print occurrence of String in sentences.
     * (without case sensitivity)
     *
     * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
     * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String word  = scanner.nextLine();

        System.out.print("Enter sentences: "  );
        String sentence = scanner.nextLine();

        int wordSentence = sentenceMiddle(word, sentence);
        System.out.println("'" + word + "' kelimesi, verilen cümlede " + wordSentence + " kez geçiyor.");
    }

    public static int sentenceMiddle(String word,String sentence){
        int sayi = 0;
        int index = sentence.indexOf(word);
        while (index != -1) {
            sayi++;
            index = sentence.indexOf(word, index + 1);
        }
        return sayi;
    }

}

