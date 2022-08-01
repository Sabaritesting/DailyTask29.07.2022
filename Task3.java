package Task2;

import java.util.Calendar;
import java.util.TimeZone;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calNewYork = Calendar.getInstance();
	     calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		    System.out.println(); 
	      System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
	        + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
			   System.out.println(); 

	}

}
