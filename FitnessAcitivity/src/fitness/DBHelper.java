package fitness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DBHelper {
	
	
	private static DBHelper instance;
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://127.0.0.1/fitnesschallenge";
	   

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	
	   
	   public static DBHelper getInstance() {
			if(instance == null) {
				instance = new DBHelper();
			}
			return instance;
		}
		
	public void loadEvents() {
		
		
		
		   
		   Connection conn = null;
		   Statement stmt = null;
		   try {
			   //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);

			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql;
			      sql = "SELECT name, px, py from fitness_events";
			      ResultSet rs = stmt.executeQuery(sql);
			      
			      
			      while(rs.next()) {
			    	  String eName = rs.getString("name");
			    	  int px = rs.getInt("px");
			    	 // String place = rs.getString("place");
			    	  
			    	  int py = rs.getInt("py");
			    	  
			    	  System.out.println(eName+ "  "+px+" "+py  );
			    	  EnventHolder.getInstance().addEvent(px, py, eName);
			    	  
			    	  
			      }
		
			   
		   }  catch(Exception ex) {
			   
		   }

		
	}
	
	
	public List<Event> getEvents(int x, int y){
		List<Event> events = new ArrayList<>();
		
		
		
		return events;
	}
	
	
	public void loadPersons() {
		
	}

}
