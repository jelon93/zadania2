import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadanie_pierwsze {

    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj imię: ");
        String imie = reader.readLine();
        System.out.println("Hello " + imie + "!");

    }

}
