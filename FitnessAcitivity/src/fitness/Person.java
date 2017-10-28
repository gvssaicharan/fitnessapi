package fitness;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Person {

	private String name;
	private String phone;
	private Set<Person> friends;
	private Set<DayActivity> activities;
	private Goal goal;
	 
	public Person(String name, String phone) {
		
		this.name= name;
		this.phone = phone;
		
		friends = new HashSet<>();
		
		activities = new TreeSet<>(new Comparator<DayActivity>() {
			
			public int compare(DayActivity a, DayActivity a2) {
				return(int) (a.getDate().getTime()-a2.getDate().getTime());
			}
		});

		
	}
	
	public void addFriend(Person friend) {
		friends.add(friend);
	}
	
	
	public Set<Person> getFriends(){
		return friends;
		
	}
	
	public void addAddActivity(DayActivity friend) {
		activities.add(friend);
	}
	
	
	public Set<DayActivity> getActivities(){
		return activities;
		
	}
	
	public Goal getGoal() {
		return goal;
	}
	
	public void setGoal(Goal goal) {
		this.goal = goal;
	}
	
	public java.util.List<DayActivity> getRecentActivities(int numDays){
		java.util.List<DayActivity> currentActivities = new ArrayList<>(numDays);
		int count = 0;
		for(DayActivity activity : activities) {
			currentActivities.add(activity);			
			if(++count>=numDays) {
				break;				
			}
		}
		return currentActivities;		
	}
	
	public boolean isGoalAchieved() {
		
		Date date = goal.getStartDate();
		int day = date.getDay();
		for(DayActivity activity : activities) {
			if(!activity.getDate().equals(date)) {
				return false;
			}
			
				}
		
		return true;
	}
	
	
}



