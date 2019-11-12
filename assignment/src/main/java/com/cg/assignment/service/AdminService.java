package com.cg.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment.dao.IAdminRepo;
import com.cg.assignment.model.Admin;

/**
 * @author v2
 *
 */
@Service
public class AdminService {

	@Autowired
	IAdminRepo iAdminRepo;

	public AdminService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param a
	 */
	public void create(Admin a) {
		iAdminRepo.save(a);
	}

	/**
	 * @param adminName
	 * @return
	 */
	public Admin searchById(String adminName) {

		return iAdminRepo.findById(adminName).orElse(null);
	}

	public Admin findByIdAndPath(String adminName, String password) {
		return iAdminRepo.findByAdminNameAndPassword(adminName, password);
	}
}
