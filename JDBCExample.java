// import required packages
import java.sql.*;

public class JDBCExample {

	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/";

	// database credentials
	static final String USER = "username";
	static final String PASS = "password";

	public static void main (String[] args) {
	
		Connection conn = null;
		Statement stmt = null;
	try{
	
		// step 2: register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		// step 3: open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		// step 4 execute a query
		System.out.println("Connecting to database...");
		stmt = conn.createStatement();

		String sql = "CREATE DATABASE STUDENTS";
		stmt.executeUpdate(sql);
		System.out.println("Database created successfully...");
	}catch(SQLException se){
	
		// handle errors for JDBC
		se.printStackTrace();
	}catch(Exception e){
	
		// handle errors for Class.forName
		e.printStackTrace();
	}finally{
	
		// finally block used to close resources
		try{
		
			if(stmt!=null)
				stmt.close();
		}catch(SQLException se2){
		}// nothing we can do
		try{
		
			if(conn!=null)
				conn.close();
		}catch(SQLException se){
		
			se.printStackTrace();
		}// end finally try
	}// end try
	System.out.println("Goodbye!");
}// end main
} // end JDBCExample
