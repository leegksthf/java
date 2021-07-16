package Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private static Connection conn = null;

	public Connection connect() {
		if (conn == null) {
			try {
				String url = "jdbc:sqlite:C:/sqlite/db/이한솔.db";
				conn = DriverManager.getConnection(url);
				System.out.println("연결성공!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
