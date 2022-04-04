import java.util.*;

public class Fibo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>(12);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        arr.add(a);
        arr.add(b);

        for(int i = 0;i<12;i++) {
            if (i > 1) {
                int x = arr.get(i-1) + arr.get(i-2);
                arr.add(x);
            }
            System.out.println(arr.get(i));
        }

    }
}
