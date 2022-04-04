package zadanie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Zadanie {

    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/user/IdeaProjects/4.3/src/main/java/zadanie/galerie.txt"));
            List<String> listaRobocza = new ArrayList<>(); // 1 String =  linijka
            List<String> listaLiczb = new ArrayList<>(); // odseparowane liczby od miejscowości
            List<String> listaMiast = new ArrayList<>(); // odseparowane nazwy miejscowości
            List<Integer> listaLokali = new ArrayList<>(); // same ilości lokali

            // każda linijka z pliku leci w listę string
            for (String line; (line = br.readLine()) != null ; ) {
                for (int i = 0; i < 3; i++) {
                    if (line.charAt(i) == 32) {
                        String city = line.substring(i+1);
                        listaRobocza.add(city);
                        break;
                    }
                }
            }
            // oddzielamy nazwy miejscowości i liczby, zapisujemy na oddzielnych listach
            for (String s: listaRobocza) {
                String miasto = "";
                char[] arr = s.toCharArray();
                for (int i =0; i<arr.length;i++) {
                    if (arr[i] != 32) {
                        miasto += arr[i];
                    } else {
                        listaLiczb.add(s.substring(i+1));
                        break;
                    }
                }
                listaMiast.add(miasto);
            }

            // obliczamy powierzchnię i liczbę unikalnych lokali
            for (String s: listaLiczb) {
                List<Integer> intList = Arrays.stream(s.split(" ")).map(Integer::parseInt).toList();
                List<Integer> lokaleUnikalne = new ArrayList<>();
                for (int i = 0; i < intList.size(); i+=2) {
                    if (intList.get(i) != 0) {
                        int lokal = intList.get(i) * intList.get(i + 1);
                        if (!lokaleUnikalne.contains(lokal)) {
                            lokaleUnikalne.add(lokal);
                        }
                    }
                }
                listaLokali.add(lokaleUnikalne.size());
            }

            int zmienna = listaLokali.get(0);
            int indexMin = 0;
            for (int i = 0; i < listaLokali.size(); i++) {
                if (listaLokali.get(i) < zmienna) {
                    zmienna = listaLokali.get(i);
                    indexMin = i;
                }
            }

            zmienna = listaLokali.get(0);
            int indexMax = 0;
            for (int i = 0; i < listaLokali.size(); i++) {
                if (listaLokali.get(i) > zmienna) {
                    zmienna = listaLokali.get(i);
                    indexMax = i;
                }
            }

            // wypisujemy
            PrintWriter out = new PrintWriter("/Users/user/IdeaProjects/4.3/src/main/java/zadanie/wynik4.3.txt");
            out.println(listaMiast.get(indexMax) + " " + listaLokali.get(indexMax));
            out.println(listaMiast.get(indexMin) + " " + listaLokali.get(indexMin));
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
