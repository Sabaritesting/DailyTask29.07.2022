package Task2;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("Input start year:");
		   Scanner s = new Scanner(System.in);
		   int fy = s.nextInt();
		   System.out.println("\nInput end year:");
		   s = new Scanner(System.in);
		   int ly = s.nextInt();
		   if (ly > fy) {
		     for (int i = fy; i <= ly; i++) {
		       System.out.println("Year: " + i + " = " + number_of_days(i));
		     }
		   } else {
		     System.out.println("End year must be greater than first year!");
		   }
		 }
	public static int number_of_days(int year) {
		   if (is_Leap_Year(year)) return 366;
		   else return 365;
		 }
		 public static boolean is_Leap_Year(int year) {
		   return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

	}

}
