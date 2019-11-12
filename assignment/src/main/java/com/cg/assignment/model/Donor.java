package com.cg.assignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author v2
 *
 */
@Document
public class Donor {
	
	String name;
//	int uId;
	String phNum;
	@Id
	String eMail;
	String pwd;
	String rePwd;
	String bloodGroup;
	DonorLocation location;

	public Donor() {
	}
	

	/**
	 * @param name
	 * @param phNum
	 * @param eMail
	 * @param pwd
	 * @param rePwd
	 * @param bloodGroup
	 * @param location
	 */
	public Donor(String name, String phNum, String eMail, String pwd, String rePwd, String bloodGroup,
			DonorLocation location) {
		super();
		this.name = name;
//		this.uId = uId;
		this.phNum = phNum;
		this.eMail = eMail;
		this.pwd = pwd;
		this.rePwd = rePwd;
		this.bloodGroup = bloodGroup;
		this.location = location;
	}


	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRePwd() {
		return rePwd;
	}

	public void setRePwd(String rePwd) {
		this.rePwd = rePwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public int getuId() {
//		return uId;
//	}
//
//	public void setuId(int uId) {
//		this.uId = uId;
//	}

	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public DonorLocation getLocation() {
		return location;
	}

	public void setLocation(DonorLocation location) {
		this.location = location;
	}

}
