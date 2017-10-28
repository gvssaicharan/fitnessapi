package fitness;

import java.util.Date;

public class Activity {
	
	String name;
	int timePerDay;
	ActivityType type;
		
	public Activity(String name, int reqTime, int timePerDay, ActivityType type) {
		this.name= name;
		this.timePerDay = timePerDay;
		this.type = type;
	}
	
	
	public int timeForDay() {
		return timePerDay;
	}
	
	
	public String getName() {
		return name;
	}
	
	public ActivityType getType() {
		return type;
	}

}
