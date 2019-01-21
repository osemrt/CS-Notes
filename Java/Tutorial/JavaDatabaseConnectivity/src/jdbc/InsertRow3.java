package jdbc;

import java.sql.*;

/*
 * If you have many rows.
 * 
 */

public class InsertRow3 {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String password = "root123";
		String query = "insert into student values (?,?)";
		
		Integer addRollNo = 53;
		String addStdNam = "John";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, addRollNo);
		st.setString(2, addStdNam);
		
		int n = st.executeUpdate();
		
		System.out.println(n);	
		
		st.close();
		con.close();
		
	}
}
