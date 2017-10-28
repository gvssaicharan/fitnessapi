package fitness;

import java.util.Date;

public class DayActivity {
	
	String name;
	int time;
	private Date day;
	
	public DayActivity(String name, int time) {
		this.name = name;
		this.time = time;
		
	}
	
	public Date getDate() {
		return day;
	}
	
	public int time() {
		return time;
	}

}
