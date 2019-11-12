package com.cg.assignment.model;

/**
 * @author v2
 *
 */
public class HospitalLocation {
	String hospitalLat;
	String hospitalLong;

	public HospitalLocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hospitalLat
	 * @param hospitalLong
	 */
	public HospitalLocation(String hospitalLat, String hospitalLong) {
		super();
		this.hospitalLat = hospitalLat;
		this.hospitalLong = hospitalLong;
	}

	public String getHospitalLat() {
		return hospitalLat;
	}

	public void setHospitalLat(String hospitalLat) {
		this.hospitalLat = hospitalLat;
	}

	public String getHospitalLong() {
		return hospitalLong;
	}

	public void setHospitalLong(String hospitalLong) {
		this.hospitalLong = hospitalLong;
	}

}
