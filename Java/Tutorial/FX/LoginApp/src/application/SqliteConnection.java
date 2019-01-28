package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnection{
	
	
	static Connection connector() {
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection("jdbc:sqlite:SchoolDb.sqlite");
			return connection;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	
	
	
	
	
	
}