package Task2;

import java.util.Scanner;

public class Task36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Input a number : ");
	        int num = sc.nextInt();
	        int sq_num = num*num;  
	 
	        String str_num = Integer.toString(num);  
	        String square = Integer.toString(sq_num);  
	 
	        if(square.endsWith(str_num))  
	            System.out.println("Automorphic Number.");
	        else
	            System.out.println("Not an Automorphic Number.");
	 
	}

}
