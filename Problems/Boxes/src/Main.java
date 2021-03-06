import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> a = new Vector<>();
        Vector<Integer> b = new Vector<>();
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        if (a.get(0) < b.get(0)) {
            if (a.get(1) < b.get(1) && a.get(2) < b.get(2)) {
                System.out.println("Box 1 < Box 2");
            } else System.out.println("Incompatible");
        } else {
            if (a.get(1) > b.get(1) && a.get(2) > b.get(2)) {
                System.out.println("Box 1 > Box 2");
            } else System.out.println("Incompatible");
        }


    }
}