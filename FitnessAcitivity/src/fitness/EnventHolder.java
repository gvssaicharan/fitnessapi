package fitness;

import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EnventHolder {
	
	Set<Event> events;
	static EnventHolder instance;
	
	public EnventHolder() {
		events = new TreeSet<>(new Comparator<Event>() {
			
			public int compare(Event e1, Event e2) {
				return distance(e1, e2);
			}
		});
	}
	
	
	public void addEvent(int x, int y, String name) {
		events.add(new Event(name,x, y));
		
	}
	public static EnventHolder getInstance() {
		if(instance == null) {
			instance = new EnventHolder();
		}
		return instance;
	}
	
	private static int distance(Event e1, Event e2) {
		return (int)Math.sqrt(Math.pow((e2.getX()-e1.getX()), 2)+ Math.pow(e2.getY(),  e1.getY()));
		
	}
	
	private static int distance(Event e1, int x, int y) {
		return (int)Math.sqrt(Math.pow((x-e1.getX()), 2)+ Math.pow(y,  e1.getY()));
		
	}
	
	
	
	public java.util.List<Event> getNearestEvents(int x, int y, int num){
		java.util.List<Event> nearestEvents = new ArrayList<>(num);
		
		int count = 0;
		
		nearestEvents.addAll(events);
		
		Collections.sort(nearestEvents, new Comparator<Event>() {
			
			public int compare(Event e1, Event e2) {
				int d1 = distance(e1, x, y);
				int d2 = distance(e1, x, y);
				return d1-d2;
			}
		});
		
		java.util.List<Event> result = new ArrayList<>(num);
		
		for(Event activity : nearestEvents) {
			if(++count<=num){
				result.add(activity);
			}
			
		}
		return result;		
	}

}
