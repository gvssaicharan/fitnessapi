package fitness;

import java.util.Date;
import java.util.Set;

public class Goal {
	
	String name;
	Set<Activity> activities;
	Date startDay;
	
	
	
	public Goal(String name) {
		this.name = name;
	}
	
	public void addAddActivity(Activity friend) {
		activities.add(friend);
	}
	
	
	public Set<Activity> getActivities(){
		return activities;
		
	}
	
	public void setSartDate(Date date) {
		startDay = date;
		
		
	}
	
	public Date getStartDate() {
		return startDay;
	}
	

}
