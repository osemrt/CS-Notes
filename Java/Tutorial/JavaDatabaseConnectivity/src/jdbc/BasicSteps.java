package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 1) import the packages. (java.sql.*;)  --> Connector
 * 2) Load & Register the Drivers. ---------> 
 * 3) Establish the Connection. ------------>
 * 4) Create the Statement. ---------------->
 * 5) Execute the Query. ------------------->
 * 6) Process the Result. ------------------>
 * 7) Close. ------------------------------->
 * 
 */

public class BasicSteps {
	
	public static void main(String[] args) throws Exception {
		
			String url = "jdbc:mysql://localhost:3306/school";
			String uname = "root";
			String passwd = "root123";
			String query = "select sname from student where rollno = 41";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, passwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			String name = rs.getString("sname");
			
			System.out.println(name);
			
			st.close();
			con.close();
			
			
	}

}








