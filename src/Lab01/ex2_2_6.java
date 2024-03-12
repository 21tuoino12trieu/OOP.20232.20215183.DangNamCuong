package Lab01;

import java.util.Scanner;
import java.lang.Math;

public class ex2_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First-degree equation with one variable");
        System.out.println("Enter the parameter a and b for the equation ax+b=0 ");
        Double a = sc.nextDouble();//sc.nextLine();
        Double b = sc.nextDouble();//sc.nextLine();
        if (a == 0) {
            if (b != 0) {
                System.out.println("No solution");
            } else {
                System.out.println("Infinite solution");
            }

        } else {
            System.out.println("Only one solution x = " + (-b / a));
        }
        System.out.println("First_degree equations with two variables");
        System.out.println("Enter the parameter for the first eqation");
        Double a11 = sc.nextDouble();//sc.next();
        Double a12 = sc.nextDouble();//sc.next();
        Double b1 = sc.nextDouble();//sc.next();
        System.out.println("Enter the parameter for the second equation");
        Double a21 = sc.nextDouble();//sc.next();
        Double a22 = sc.nextDouble();//sc.next();
        Double b2 = sc.nextDouble();//sc.next();
        Double d = a11 * a22 - a21 * a12;
        Double dx = b1 * a22 - b2 * a12;
        Double dy = a11 * b2 - a21 * b1;
        if (d != 0) {
            System.out.println("Only one solution (x,y) is " + "(" + (dx / d) + "," + (dy / d) + ")");
        } else {
            if (dx == 0 && dy == 0) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        }

        System.out.println("Second degree equation");
        System.out.println("Enter the parameter of this equation ax^2+bx+c=0");
        Double a_ = sc.nextDouble();//sc.next();
        Double b_ = sc.nextDouble();//sc.next();
        Double c_ = sc.nextDouble();//sc.next();
        double delta = b_ * b_ - 4 * a_ * c_;
        if (delta < 0) {
            System.out.println("No solution");
        } else if (delta == 0) {
            System.out.println("Only solution x= " + (-b_ / (2 * a_)));
        } else {
            System.out.println("The first solution is x1= " + ((-b_ + Math.sqrt(delta)) / (2 * a_)));
            System.out.println("The first solution is x1= " + ((-b_ - Math.sqrt(delta)) / (2 * a_)));
        }
        sc.close();
    }


}