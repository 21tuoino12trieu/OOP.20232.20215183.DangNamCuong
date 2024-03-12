package Lab01;

import java.util.Scanner;

public class ex6_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        int[][] a = new int[row][column];
        int[][] b = new int[row][column];
        int[][] res = new int[row][column];
        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[i][j] = sc.nextInt();
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The result is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}