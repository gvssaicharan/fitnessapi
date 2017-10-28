package fitness;

public class Event {
	
	private String name;	
	int x;
	int y;
	
	String place;
	
	
	public Event(String name, int x, int y) {
		this.name = name;
		this.x= x;
		this.y= y;
		
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getPlace() {
		return name;
	}
	

}
