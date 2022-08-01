package Task2;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int a = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (a * 2); i++) 
        {

            for (int spc = a - no_of_spaces; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            if (i < a) 
            {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else 
            {
                start = a * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(start);
                if (j < count / 2) 
                {
                    start--;
                } else 
                {
                    start++;
                }
            }
            if (i < a)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
  
	}

}
