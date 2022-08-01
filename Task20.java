package Task2;

import java.time.LocalTime;

public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.of(12, 24, 32);  
	      int hour = time.getHour(); 
	      int minute = time.getMinute();  
	      int second = time.getSecond(); 
	      System.out.println("\nCurrent Local time: " + time);
	      System.out.println("Hour: " + hour);
	      System.out.println("Minute: " + minute); 
	      System.out.println("Second: " +second+"\n");
	}

}
