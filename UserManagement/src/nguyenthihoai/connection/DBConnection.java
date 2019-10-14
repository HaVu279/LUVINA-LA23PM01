/**
 * Copyright(C) 2019 Luvina Software Company
 * DBConnection.java Oct 11, 2019 nthoai
 */
package nguyenthihoai.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Kết nối ứng dụng Java với cơ sở dữ liệu MySQL
 * @author nthoai
 *
 */
public class DBConnection {
	
	protected Connection conn;
	
	/**
	 * Hàm mở kết nối với DB để thực hiện kết nối với cơ sở dữ liệu
	 * @return một đối tượng Connection
	 */
	public Connection openConnection() throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "CDs?useUnicode=yes&characterEncoding=UTF-8";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "";
		
		try {
			Class.forName(driver);
			this.conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(this.getClass().getName() + " - openConnection() - " + e.getMessage());
			throw e;
		} 
		
		return conn;
	}


	/**
	 * Hàm đóng kết nối
	 */
	public void closeConnection() throws SQLException{
		try {
			if(conn != null || !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println(this.getClass().getName() + " - closeConnection() - " + e.getMessage());
			throw e;
		}
	}
}
