import java.io.*;
import java.util.*;

public class zadanie
{

    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/user/IdeaProjects/4.1/src/main/java/galerie.txt"));
            List<String> listaPanstw = new ArrayList<>(); //lista prefixow panstw
            Map<String, Integer> mapaPanstw = new HashMap<>();

            //oddzielamy prefixy
            for (String line; (line = br.readLine()) != null ; ) {
                String country = "";
                for (int i = 0; i < 3; i++) {
                    if (line.charAt(i) != 32) {
                        country = country + line.charAt(i);
                    } else {
                        break;
                    }
                }
                listaPanstw.add(country);
                }

            // sprawdź jak czesto sie powtarza
            for (String s: listaPanstw) {
                int x = 0;
                for(String y: listaPanstw) {
                    if (y.equals(s)) x++;
                }
                mapaPanstw.put(s,x); //dodaj do mapy z liczbą wystąpień
            }

            //wypisz
            PrintWriter out = new PrintWriter("/Users/user/IdeaProjects/4.1/src/main/java/wynik4.1.txt");
            for (Map.Entry<String,Integer> entry : mapaPanstw.entrySet()) {
                String text = entry.getKey() + " " + entry.getValue();
                System.out.println(text);
                out.println(text);
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
