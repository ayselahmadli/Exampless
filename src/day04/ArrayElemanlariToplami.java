package day04;

import static day04.array.scan;

public class ArrayElemanlariToplami {

    public static void ArrayElemanlariToplami(){
        System.out.println("Lutfen Array in size ini belirtin");
        int size = scan.nextInt();
        int[] employeeSalary = new int[size] ;

        //Array i create etmek icin for loop kullanalim
        for(int i =0 ; i<size ; i++){
            System.out.println(1+i+". Calisan");
            employeeSalary[i] = scan.nextInt() ;
        }
        int sayac = 0;
        //Array icersindeki verilerin toplami
        for(int i=0 ; i<size ; i++){
            sayac += employeeSalary[i];
        }
        System.out.println("Calisanlarin Maaslari Toplami :"+ sayac);

    }

    public static void main(String[] args) {
        // printArrayMethod() ;
        ArrayElemanlariToplami() ;
}
}
