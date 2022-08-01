package Task2;

import java.time.LocalDateTime;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
	      System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());  
	      System.out.println("Before 7 hours and 30 minutes: " + dateTime+"\n");  
	}

}
