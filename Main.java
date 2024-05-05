import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String args[]) {
        int jumlahBaris = 10;
        System.out.println(jumlahBaris);

        String kalimatBaru = "Deklarasi tipe data string";
        System.out.println(kalimatBaru);

        int empatAngka[] = { 07, 10, 20, 23 };
        System.out.println(Arrays.toString(empatAngka));

        String alfabet[][] = { 
            {"p", "s", "n"},
            {"w", "l", "b"},
            {"f", "r", "e"}
         };
        for(String row[] : alfabet) {
            System.out.println(Arrays.toString(row));
        }

        ArrayList<Integer> listAngka = new ArrayList<Integer>(List.of(26, 23, 24, 16));
        System.out.println(listAngka);
    }
}
