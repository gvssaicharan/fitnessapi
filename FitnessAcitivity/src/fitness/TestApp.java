package fitness;

import java.time.Period;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TestApp {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		String option = "";
		DBHelper.getInstance().loadEvents();
		
		while(true){
			
						
			System.out.print("\n\nCurrent location (x y) : ");
			
			int px = 0;
			int py = 0;
			
			try{
			px = Integer.valueOf(scanner.next());
			py = Integer.valueOf(scanner.nextInt());
			}
		    catch (Exception e) {
		    	
		    	System.out.println("\n\nInvalid input. Please provide numbers\n");
		    	continue;
				
			}
			
			
			List<Event> events = EnventHolder.getInstance().getNearestEvents(px, py, 2);
			
			System.out.println("Top events");
			
			System.out.println("===========================");
	  	  
	  	  for(Event ev: events) {
	  		  
	  		  System.out.println(ev.getPlace());
	  		  
	  	  }
			
			
		}
		
		
		
		
		
	}

}
