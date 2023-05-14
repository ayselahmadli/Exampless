package Okul_yonetimi;

import java.util.Scanner;

public class AnaMenu {
    Scanner scanner = new Scanner(System.in);

/*====================================
    ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
    ====================================
            1- ÖĞRENCİ İŞLEMLERİ
            2- ÖĞRETMEN İŞLEMLERİ
               Q- ÇIKIŞ */

void menu(){
    System.out.println("====================================\n" +
            "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
            "\t====================================\n" +
            "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
            "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
            "\t Q- ÇIKIŞ\n" +
            "\t SEÇİMİNİZ: ");

    char secim = scanner.next().toUpperCase().charAt(0);
    switch (secim){
        case '1':{}
        case '2':{}
        case 'Q':{}
    }
}
}
