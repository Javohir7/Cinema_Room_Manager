import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (i == i1) System.out.print("* ");
                else if (i1 == n / 2) System.out.print("* ");
                else if (i + i1+1 == n) System.out.print("* ");
                else if (i == n / 2) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}