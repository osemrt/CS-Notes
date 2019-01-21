
package jdbc;

import java.sql.*;

public class InsertRow1 {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String password = "root123";
		String query = "insert into student values (74, 'Bob')";		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		int n = st.executeUpdate(query);
		System.out.println(n + " row/s affected...");
		
		st.close();
		con.close();
	}

}
