package Examples;

import java.util.Scanner;

public class BanknotCevirici {


   /* Soru-2) kullanıcının girdiği TL miktarını en az banknot sayısına
             çeviren programı array kullanarak yapınız.
             int[ ] bankonatlar = {200, 100, 50, 20, 10, 5, 1};
             Örneğin Lütfen Testirlik Maaşınızı TL Olarak Girin: 8642
             Minimum banknot sayısı:
             43 x 200 TL
             2 x 20 TL
             2 x 1 TL
             Toplam Kullanılan Bankonot Sayısı: 47*/


    public static void main(String[] args) {

            int[] banknotlar = {200, 100, 50, 20, 10, 5, 1};
            int[] adetler = new int[banknotlar.length];

            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen TL miktarını giriniz: ");
            int tlMiktari = scanner.nextInt();

            for (int i = 0; i < banknotlar.length; i++) {
                adetler[i] = tlMiktari / banknotlar[i];
                tlMiktari %= banknotlar[i];
            }

            System.out.print("Minimum banknot sayısı:");
            int toplamBanknot = 0;
            for (int i = 0; i < banknotlar.length; i++) {
                if (adetler[i] > 0) {
                    System.out.println(adetler[i] + " x " + banknotlar[i] + " TL");
                    toplamBanknot += adetler[i];
                }
            }

            System.out.println("Toplam Kullanılan Banknot Sayısı: " + toplamBanknot);

            scanner.close();
        }
    }









