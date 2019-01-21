package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllTable {
	
	public static void main(String[] args) throws Exception {
			
			String url = "jdbc:mysql://localhost:3306/school";
			String user = "root";
			String password = "root123";
			String query = "select * from student";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				String student = rs.getInt("rollNo") + ": " + rs.getString("sname");
				System.out.println(student);
			}
			
			
			st.close();
			con.close();		
			
		
	}

}
