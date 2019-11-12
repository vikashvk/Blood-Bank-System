package com.cg.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment.dao.IDonorRepo;
import com.cg.assignment.model.Donor;

/**
 * @author v2
 *
 */
@Service
public class DonorService {

	@Autowired
	IDonorRepo iDonorRepo;

	public DonorService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param donor
	 * @return
	 */
	public Donor create(Donor donor) {
		return iDonorRepo.save(donor);
	}

	/**
	 * @return
	 */
	public List<Donor> getAllDonors(){
		return iDonorRepo.findAll();
	}
}
