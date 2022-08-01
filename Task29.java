package Task2;

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Input Side-1: ");
        double a = sc.nextDouble();
        System.out.print("Input Side-2: ");
        double b = sc.nextDouble();
        System.out.print("Input Side-3: ");
        double c = sc.nextDouble();
        System.out.println((a,b,c) ?"The area of the triangle is " + area_triangle(a,b,c) : "Invalid triangle");
	}
}
