package Examples;

import java.util.Scanner;

public class sesliHarfler {

    //Java'da kullanıcıdan bir metin alan ve bu metindeki sesli harfleri kaldıran bir program yazın.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz :");
        String metin = scanner.nextLine();

        String newMetin = metin.replaceAll("[aeiouAIOU]","");
        System.out.println("Yeni metin :" + newMetin);
    }

}
