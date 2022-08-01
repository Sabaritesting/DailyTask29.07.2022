package Task2;

import java.util.Scanner;

public class Task38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        int num = sc.nextInt(); 
       int n = (int) Math.round(Math.pow(num, 1.0/3.0));
        if((num == n * n * n))
			{
			   System.out.print("Number is a cube.");
            }
		   else
			{
				System.out.print("Number is not a cube.");
			}
				System.out.println("\n");
	}

}
