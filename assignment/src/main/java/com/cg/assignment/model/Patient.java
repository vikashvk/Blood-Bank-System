package com.cg.assignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author v2
 *
 */
@Document(collection = "Patients")
public class Patient {
	@Id
	String patientId;
	String patientName;
	String bloodGroup;
	String phoneNum;
	HospitalLocation hospitalLocation;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param patientId
	 * @param patientName
	 * @param bloodGroup
	 * @param phoneNum
	 * @param hospitalLocation
	 */
	public Patient(String patientId, String patientName, String bloodGroup, String phoneNum,
			HospitalLocation hospitalLocation) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.phoneNum = phoneNum;
		this.hospitalLocation = hospitalLocation;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public HospitalLocation getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(HospitalLocation hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", bloodGroup=" + bloodGroup + ", phoneNum=" + phoneNum
				+ ", hospitalLocation=" + hospitalLocation + "]";
	}
}
