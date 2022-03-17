import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;


public class pierwsza {


    public static void dziesiecNaDwa (String x) {


        String liczbaBinarna = new String();
        int y = Integer.parseInt(x);
        while (y >= 1) {
            int z = y%2;
            liczbaBinarna = liczbaBinarna + z;
            y = y/2;
        }

        System.out.println("Wynik " + new StringBuilder(liczbaBinarna).reverse().toString());

    }

    public static void dwaNaDziesiec (String x) {

        int y = 0;
        ArrayList<Integer> listaLiczb = new ArrayList<>();
        for (char ch: x.toCharArray()) {
            y++;
            int z = Integer.parseInt(Character.toString(ch));
            listaLiczb.add(z);
        }

        int liczbaDziesietna = 0;

        while (y >= 1) {
            for (int i = 0; i < listaLiczb.size(); i++) {
                double z = listaLiczb.get(i) * Math.pow(2, y - 1);
                liczbaDziesietna += z;
                y--;
            }
        }

        System.out.println("Wynik: " + liczbaDziesietna);

    }


    public static void main (String[] args) throws Exception {

        System.out.println("Witaj w programie do konwersji pomiędzy systemem binarnym a dzisiętnym");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Wpisz liczbę: "); // Liczba do konwersji
        String liczba = reader.readLine();
        System.out.print("Wpisz podstawę systemu wejściowego: "); //Podstawa systemu wejściowa
        int podstawa1 = Integer.parseInt(reader.readLine());

        if (podstawa1 == 10) {
            dziesiecNaDwa(liczba);
        } else {
            dwaNaDziesiec(liczba);
        }
    }

}
