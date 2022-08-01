package Task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate today = LocalDate.now(); 
	     LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
	     Period period = today.until(lastDayOfYear);
	     System.out.println();
	     System.out.println("Months remaining in the year: "+period.getMonths());	
	     System.out.println();
	}

}
