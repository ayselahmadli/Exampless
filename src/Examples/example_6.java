package Examples;

import java.util.Scanner;

public class example_6 {

    /*
                StringMethods:
                cift uzunlukta bir degiskenin ortasindaki harfi konsolda yazdirmak icin bir Java programi yaziniz.
                Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
                ORNEK:
                INPUT      :  Python
                OUTPUT :   th
        */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.nextLine();
        String ortadakiHarf = kelimeOrtasi(kelime);
        System.out.println("Ortadaki harfler : " + ortadakiHarf);

    }
        public static  String kelimeOrtasi(String kelime){
        int uzunluk = kelime.length();
        int orta = uzunluk / 2;

        if (uzunluk  % 2 == 0){
            System.out.println("Ortadaki harfler : " + kelime.charAt(orta - 1) + kelime.charAt(orta));

        } else {


        }
            return "" + kelime.charAt(orta);

}
}

