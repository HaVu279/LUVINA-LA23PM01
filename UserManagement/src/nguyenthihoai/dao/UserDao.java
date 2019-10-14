/**
 * Copyright(C) 2019 Luvina Software Company
 * DBConnection.java Oct 11, 2019 nthoai
 */
package nguyenthihoai.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import nguyenthihoai.connection.DBConnection;
import nguyenthihoai.entities.User;

/**
 * Thao tác với database
 * @author nthoai
 *
 */
public class UserDao extends DBConnection{
	
	
	/**
	 * Thực hiện lấy danh sách đối tượng User có trong DB
	 * @return trả về 1 mảng các đối tượng User
	 * @throws SQLException – một lớp xử lý lỗi ngoại lệ chứa các lỗi truy cập cơ sở dữ liệu
	 * @throws ClassNotFoundException
	 */
	public ArrayList<User> listUser() throws ClassNotFoundException, SQLException{
		String query = "SELECT * FROM USER";
		ArrayList<User> list = new ArrayList<User>();
		try {
			conn = openConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet resultSet = stmt.executeQuery(query);
			while(resultSet.next()) {
				User user = new User();
				user.setName(resultSet.getString("name"));
				user.setBirthday(resultSet.getDate("birthday"));
				user.setBirthplace(resultSet.getString("birthplace"));
				list.add(user);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(this.getClass().getName() + " - listUser() - " + e.getMessage());
		}
		
		return list;
	}
}
