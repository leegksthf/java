package co.memo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public Connection conn;
	
	protected Connection connect() {
		String url = "jdbc:sqlite:C:/sqlite/db/이한솔.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결성공!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return conn;
	}
}
