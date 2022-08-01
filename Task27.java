package Task2;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Input a number: ");
	        int a = sc.nextInt();
	        printMatrix(a);
	}

	private static void printMatrix(int a) {
		// TODO Auto-generated method stub
		 for(int i = 0; i < a; i++) {
	            for(int j = 0; j < a; j++) {
	                System.out.print((int)(Math.random() * 2) + " ");
	            }
	            System.out.println();
	        }	
	}

}
