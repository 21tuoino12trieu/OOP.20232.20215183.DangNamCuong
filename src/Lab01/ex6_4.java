package Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class ex6_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);
        double sum = 0;
        for (double d : a) {
            System.out.print(d + " ");
            sum += d;
        }
        System.out.println();
        System.out.println("Sum of array: " + sum);
        System.out.println("Average value: " + (sum / n));
        sc.close();
    }
}