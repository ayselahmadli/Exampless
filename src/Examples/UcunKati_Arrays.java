package Examples;

import java.util.ArrayList;

public class UcunKati_Arrays {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        ArrayList<Integer> uclerinKatiListesi = uclerinKati(list);
        System.out.println("3'Lerin Kati" + uclerinKatiListesi);

    }

    public static ArrayList<Integer> uclerinKati(ArrayList<Integer> liste) {
        ArrayList<Integer> uclerinKatiListesi = new ArrayList<>();
        for (int sayi : liste) {
            if (sayi % 3 == 0) {
                uclerinKatiListesi.add(sayi);
            }
        }
        return uclerinKatiListesi;
    }
}
