package fitness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {
	
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://127.0.0.1/fitnesschallenge";
	   

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	
	public static void main(String[] args) {
		

		   
		  
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
			      sql = "SELECT * from Person";
			      ResultSet rs = stmt.executeQuery(sql);
			      
			      System.out.println("result  " + rs.next());
		
			   
		   }  catch(Exception ex) {
			   
		   }
		     	      
		      

	}

}
