import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a, b;
        n = sc.nextInt();
        m = sc.nextInt();
        int array[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean f = true;
            for (int i1 = 0; i1 < m; i1++) {
                int index = i1;
                if (i1 == a ) {
                    index = b;
                } else if (i1 == b) {
                    index = a;
                }
                System.out.print(array[i][index] + " ");
            }

            System.out.println();
        }
    }
}