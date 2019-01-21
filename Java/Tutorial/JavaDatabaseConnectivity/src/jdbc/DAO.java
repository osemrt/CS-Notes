package jdbc;

import java.sql.*;

class Student{
	int rollNo;
	String sname;
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + "]";
	}
	
	public Student() {
		
	}

	public Student(int rollNo, String sname) {
		this.rollNo = rollNo;
		this.sname = sname;
	}	
	
}

public class DAO {
	
	public static void main(String[] args) throws Exception {
		
		StudentDAO dao = new StudentDAO();
		
		//Add data.
		Student std = new Student(11,"Mike");
		dao.addStudent(std);
		
		//Fetch data.		
		System.out.println(dao.getStudent(11));
		
		//Delete data.
		dao.removeStudent(11);
		
		
	}

}

class StudentDAO{

	Student getStudent(int rollNo) throws Exception {
		Student std = new Student();
		std.rollNo = rollNo;
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select sname from student where rollNo=" + rollNo);
		rs.next();
		std.sname = rs.getString("sname");
		
	
		
		return std;		
		
	}
	
	void addStudent(Student std) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root123");
		PreparedStatement pst = con.prepareStatement("insert into student values (?,?)");
		pst.setInt(1, std.rollNo);
		pst.setString(2, std.sname);
		int n = pst.executeUpdate();		
		
		System.out.println(n + "row/s affected.. addStudent");
		
	}
	
	
	void removeStudent(int rollNo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root123");
		Statement st = con.createStatement();
		int n = st.executeUpdate("delete from student where rollNo = " + rollNo);
		
		System.out.println(n+ "row/s affected.. removeStudent");
		
	}
	
	
	
	
}
