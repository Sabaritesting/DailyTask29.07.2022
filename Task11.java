package Task2;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2022;
	       System.out.println();        
	       if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	               System.out.println("Year " + year + " is a leap year");
	       else
	               System.out.println("Year " + year + " is not a leap year");
	               System.out.println();
	}

}
