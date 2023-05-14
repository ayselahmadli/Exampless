package Okul_yonetimi;

import java.util.Scanner;

public class OgrenciIslemleri {
    Scanner scanner = new Scanner(System.in);

    void ogrenciMenu(){
        System.out.println("============= İŞLEMLER =============\\n\" +\n" +
                "                \"\\t\\t 1-EKLEME\\n\" +\n" +
                "                \"\\t\\t 2-ARAMA\\n\" +\n" +
                "                \"\\t\\t 3-LİSTELEME\\n\" +\n" +
                "                \"\\t\\t 4-SİLME\\n\" +\n" +
                "                \"\\t\\t Q-ÇIKIŞ\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\tSEÇİMİNİZ:\");");

        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1': {
                ekleme();
            }
            case '2': {
             //   arama();
            }
            case '3': {
               // listeleme();
            }
            case '4': {
            }
            case 'Q': {
            }
        }
    }

    private void ekleme() {
        //Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf
        scanner.nextLine();
        System.out.println("ÖĞRENCİNİN ADINI GİRİNİZ: ");
        String ad=scanner.nextLine();
        System.out.println("ÖĞRENCİNİN SOYADINI GİRİNİZ: ");
        String sad=scanner.nextLine();
        System.out.println("ÖĞRENCİNİN TCNO GİRİNİZ: ");
        String tcNo=scanner.nextLine();
        System.out.println("ÖĞRENCİNİN YAŞINI GİRİNİZ: ");
        int yas=scanner.nextInt();
        System.out.println("ÖĞRENCİNİN NUMARA GİRİNİZ: ");
        int numara=scanner.nextInt();
        System.out.println("ÖĞRENCİNİN SINIFINI GİRİNİZ: ");
        String sinif=scanner.next();
    }
}

