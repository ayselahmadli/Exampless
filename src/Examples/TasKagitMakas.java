package Examples;
import java.util.Random;
import java.util.Scanner;
public class TasKagitMakas {

    // Bilgisayara karşı taş kağıt makas oyunu oynayalım
        //5 puana kim ulaşırsa onun kazandığını söylesin


        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            Random rnd=new Random();

            int userChoice=0;
            int compChoice=0;
            int userPoint=0;
            int compPoint=0;

            do{
                System.out.println("Lütfen Seçim yapınız:\n1-Taş \n2-Kağıt \n3-Makas ");

                //Kullanıcının seçimini isteyeceğiz
                userChoice= scan.nextInt();

                //Bilgisayar için random bir değer üretceğiz
                compChoice=rnd.nextInt(3)+1; //0-3 -0 dahil 3 dahil değil şekilde bir değer üreteceği için +1 dedik.

                if (userChoice==1 && compChoice==2){
                    System.out.println("Bilgisayarın seçtiği: "+ compChoice);
                    System.out.println("");
                    System.out.println("Kağıt taşı sarar -- Bilgisayar Kazandı");
                    compPoint++;
                    System.out.println("Sizin Puanınız: " + userPoint +"\n Bilgisayarın Puanı: "+compPoint);
                    System.out.println("");
                }else if (userChoice==1 && compChoice==3){
                    System.out.println("Bilgisayarın seçtiği: "+ compChoice);
                    System.out.println("");
                    System.out.println("Taş makası kırar -- Siz kazandınız");
                    userPoint++;
                    System.out.println("Sizin Puanınız: "+userPoint+"\nBilgisayarın Puanı: "+compPoint);
                    System.out.println("");
                }else if (userChoice==2 && compChoice==1){
                    System.out.println("Bilgisayarın seçtiği: "+ compChoice);
                    System.out.println("");
                    System.out.println("Kağıt taşı sarar -- Siz kazandınız");
                    userPoint++;
                    System.out.println("Sizin Puanınız: "+userPoint+"\n Bilgisayarın Puanı: "+compPoint);
                    System.out.println("");

                }else if (userChoice==2 && compChoice==3){
                    System.out.println("Bilgisayarın seçtiği: "+ compChoice);
                    System.out.println("");
                    System.out.println("Makas Kağıdı keser -- Bilgisayar kazandı");
                    compPoint++;
                    System.out.println("Sizin Puanınız: "+userPoint+"\n Bilgisayarın Puanı: "+compPoint);
                    System.out.println("");
                }else if (userChoice==3 && compChoice==1){
                    System.out.println("Bilgisayarın seçtiği: " +compChoice);
                    System.out.println("");
                    System.out.println("Taş makası kırar -- Bilgisayar kazandı");
                    compPoint++;
                    System.out.println("Sizin Puanınız: "+userPoint+"\nBilgisayarın puanı: "+compPoint);
                    System.out.println("");
                }else if (userChoice==3 && compChoice==2){
                    System.out.println("Bilgisayarın seçtiği: "+compChoice);
                    System.out.println("");
                    System.out.println("Makas kağıdı keser -- Siz kazandınız");
                    userPoint++;
                    System.out.println("Sizin Puanınız: "+userPoint+"\nBilgisayarın puanı: "+compPoint);
                    System.out.println("");
                }else{
                    System.out.println("Bilgisayar sizinle aynı şeyi seçti. Kimse puan alamadı");
                    System.out.println("Sizin Puanınız: "+userPoint+"\n Bilgisayarın Puanı: "+compPoint);
                    System.out.println("");
                }
            }while (userPoint!=5 && compPoint!=5 );
            if (userPoint>compPoint){
                System.out.println("Tebrikler Siz Kazandınız.");
            }else{
                System.out.println(" Maalesef Kaybettiniz. Bilgisayar kazandı");
            }
            System.err.println("Oyun Bitti");
        }
    }

