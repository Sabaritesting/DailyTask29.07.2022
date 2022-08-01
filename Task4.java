package Task2;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ZoneId.SHORT_IDS.keySet().
		    stream().forEach( 
		    zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );
		    }
	}


