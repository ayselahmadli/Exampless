package Examples;


import java.util.Scanner;

public class geometrikOrtalama {

    public static void main(String[] args) {

        // Verilen Arrayde bulunan degerlerin geometrik ortalamasını hesaplayan
        //mehod olusturalim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ortalamasini bulmak istediginiz arrayin olcusunu giriniz :");
        int arrayBoyut = scanner.nextInt();

        int [] dizi = new int[arrayBoyut];

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = scanner.nextInt();

    }
        double geometrikOrtalama = geometrikOrtalamayiHesapla(dizi);
        System.out.println("Dizi elemanlarının geometrik ortalaması: " + geometrikOrtalama);

    }
    public static double geometrikOrtalamayiHesapla(int[] dizi){
        double carpma = 1.0;
        for (int i = 0; i < dizi.length; i++) {
            carpma *=dizi[i];
        }
        return Math.pow(carpma, 1.0 / dizi.length);

            
        }

    }





