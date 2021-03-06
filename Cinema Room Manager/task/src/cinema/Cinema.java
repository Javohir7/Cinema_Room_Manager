package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column, rowIndex = -1, columnIndex = -1, currentIncome = 0,
                price, ticketsCount = 0;
        System.out.println("Enter the number of rows:");
        row = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        column = sc.nextInt();
        int totalIncome = total_Income(row, column);
        char[][] array = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = 'S';
            }
        }
        while (true) {
            System.out.println("\n1. Show the seats \n2. Buy a ticket \n3. Statistics \n0. Exit");
            int command = sc.nextInt();
            if (command == 0) {
                break;
            } else if (command == 1) {
                print_Seat(row, column, array);
            } else if (command == 2) {
                boolean is_add = false;
                while (!is_add) {
                    System.out.println("Enter a row number:");
                    rowIndex = sc.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    columnIndex = sc.nextInt();
                    if (row * column < 60) {
                        price = 10;
                    } else {
                        if (rowIndex <= row / 2) price = 10;
                        else price = 8;
                    }
                    if (0 <= rowIndex && rowIndex <= row && 0 <= columnIndex && columnIndex <= column) {
                        if (array[rowIndex - 1][columnIndex - 1] == 'B') {
                            System.out.println("That ticket has already been purchased!");
                        } else {
                            System.out.printf("Ticket price: $%d \n", price);
                            array[rowIndex - 1][columnIndex - 1] = 'B';
                            is_add = true;
                            currentIncome += price;
                            ticketsCount++;

                        }
                    } else {
                        System.out.println("Wrong input!");
                    }
                }
            } else if (command == 3) {
                System.out.println("Number of purchased tickets: " + ticketsCount);
                System.out.printf("Percentage: %.2f",((100.0 * ticketsCount) / (row * column)));
                System.out.print("% \n");
                System.out.println("Current income: $" + currentIncome);
                System.out.println("Total income: $" + totalIncome);


            }
        }
    }

    public static void print_Seat(int n, int m, char[][] array) {
        System.out.println("Cinema:");
        for (int i = 0; i <= m; i++) {
            if (i == 0) System.out.print("  ");
            else System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < m; j++) {
                System.out.print(array[i - 1][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int total_Income(int row, int column) {
        int summa = 0;
        if (row * column < 60) {
            summa = row * column*10;
        } else {
            summa = (row / 2 * column) * 10 + (row - row / 2) * column * 8;
        }
        return summa;
    }
}