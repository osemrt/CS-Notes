package jdbc;

import java.sql.*;

public class InsertRow2 {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/School";
		String user = "root";
		String password = "root123";
		
		String addRollNo = "21";
		String addStdName = "Wernick";
		
		String query = "insert into student values (" + addRollNo + ", '" + addStdName + "' )";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		int n = st.executeUpdate(query);
		
		System.out.println(n);
		
		st.close();
		con.close();
		
	}
}
