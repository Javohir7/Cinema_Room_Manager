import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1, n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int val = a[0] * b[0];
        for (int i = 1; i < n; i++) {
            if (a[i] * b[i] > val) {
                val = a[i] * b[i];
                ans = i + 1;
            }
        }
        System.out.print(ans);

    }
}