package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static void main(String[] args) {
		/*DbConnection db = new DbConnection();
		System.out.println(db.name);    //測試用
		*/

		System.out.println(DbConnection.getDb());

	}
	
	String name;
	
	public static Connection getDb()
	{
		Connection conn = null;
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
						
		} catch (ClassNotFoundException e) {
			System.out.println("no driver!!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection!!!");
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
