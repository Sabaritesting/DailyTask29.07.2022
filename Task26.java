package Task2;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Input a year: ");
		        int year = sc.nextInt();
		        System.out.println(is_LeapYear(year));

		 }
		        public static boolean is_LeapYear(int y)
		        {
		            boolean a = (y % 4) == 0;
		            boolean b = (y % 100) != 0;
		            boolean c = ((y % 100 == 0) && (y % 400 == 0));

		            return a && (b || c);

		    }
	}

	
