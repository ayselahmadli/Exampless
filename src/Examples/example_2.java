package Examples;

import java.util.Scanner;

public class example_2 {
     /* Write a Java program to compute body mass index (BMI)
         * print the situation.
         * Isuser weak, fat or obese ?
            *
            * (Hint BMI = weight(kg)/ (height*height)(m)
            * BMI<20 weak
         * 20<BMI<25 healthy
         * 25<BMI<30 fat
         * Over 30 obese
         */


    /* Vücut kitle indeksini (BMI) hesaplamak için bir Java programı yazın
          * durumu yazdırın.
            * Kullanıcı zayıf mı, şişman mı yoksa obez mi?
            *
            * (İpucu BKİ = ağırlık(kg)/ (boy*boy)(m)
            * VKİ<20 zayıf
          * 20<VKİ<25 sağlıklı
          * 25<VKİ<30 yağ
          * 30 üzeri obez
          */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight");
        int weight = scanner.nextInt();

        System.out.println("Please enter your height");
        double height = scanner.nextDouble();

        double BMI = weight/ (height*height);

        if (BMI < 20) System.out.println("You are weak" );

        else if(20 < BMI && BMI < 25) System.out.println("You are healthy");
        else if(25 < BMI && BMI < 30) System.out.println("You are fat");
        else System.out.println("You are obese");
    }



}

