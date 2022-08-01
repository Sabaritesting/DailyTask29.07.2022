package Task2;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task33 {
	  static boolean isHappy_number(int num)
	    {
	        Set<Integer> unique_num = new HashSet<Integer>();

	        while (unique_num.add(num))
	        {
	            int value = 0;
	            while (num > 0)
	            {
	                value += Math.pow(num % 10, 2);
	                num /= 10;
	            }
	            num = value;
	        }

	        return num == 1;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("Input a number: ");
	        int a = new Scanner(System.in).nextInt();
	        PrintStream printStream = new PrintStream(null);
			printStream.println(isHappy_number(a) ? "Happy Number" : "Unhappy Number");
	    
	}

}
