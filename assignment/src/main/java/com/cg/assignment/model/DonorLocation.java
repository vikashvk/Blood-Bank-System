package com.cg.assignment.model;

/**
 * @author v2
 *
 */
public class DonorLocation {
	double donorLat;
    double donorLong;

    public DonorLocation() {
    }

    /**
     * @param donorLat
     * @param donorLong
     */
    public DonorLocation(double donorLat, double donorLong) {
        this.donorLat = donorLat;
        this.donorLong = donorLong;
    }

    public double getDonorLat() {
        return donorLat;
    }

    public void setDonorLat(double donorLat) {
        this.donorLat = donorLat;
    }

    public double getDonorLong() {
        return donorLong;
    }

    public void setDonorLong(double donorLong) {
        this.donorLong = donorLong;
    }
}
