import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        if (m == 0) return 1;
        long k = power(n, m / 2);
        k = k * k;
        if (m % 2 == 0) {
            return k;
        } else return k * n;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}