package com.cg.assignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author v2
 *
 */
@Document
public class Admin {
	@Id
	String adminName;
	String password;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adminName
	 * @param password
	 */
	public Admin(String adminName, String password) {
		super();
		this.adminName = adminName;
		this.password = password;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
