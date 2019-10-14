/**
 * Copyright(C) 2019 Luvina Software Company
 * DBConnection.java Oct 11, 2019 nthoai
 */
package nguyenthihoai.entities;

import java.sql.Date;

/**
 * Đối tượng User
 * @author nthoai
 *
 */
public class User {
	private int id;
	private String name;
	private Date birthday;
	private String birthplace;
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the birthPlace
	 */
	public String getBirthplace() {
		return birthplace;
	}
	/**
	 * @param birthPlace the birthPlace to set
	 */
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

}
