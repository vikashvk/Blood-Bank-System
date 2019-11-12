package com.cg.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.assignment.dao.IDonorRepo;
import com.cg.assignment.dao.IPatientRepo;
import com.cg.assignment.model.Admin;
import com.cg.assignment.model.Donor;
import com.cg.assignment.model.DonorLocation;
import com.cg.assignment.model.Patient;
import com.cg.assignment.service.AdminService;
import com.cg.assignment.service.DonorService;
import com.cg.assignment.service.PatientService;
import com.cg.assignment.service.SMSService;

/**
 * @author v2
 *
 */
@RequestMapping("/cg/blood")
@CrossOrigin
@RestController
public class BloodsController {
	@Autowired
	private IPatientRepo iPatientRepo;
	@Autowired
	private IDonorRepo iDonorRepo;
	@Autowired
	AdminService adminService;
	@Autowired
	DonorService donorService;
	@Autowired
	PatientService patientService;
	@Autowired
	PasswordEncoder passwordEncoder;

	/**
	 * @return
	 */
	@GetMapping("/parse")
	public List<Patient> getAllPatient() {
		return iPatientRepo.findAll();
	}

	/**
	 * @param donor
	 * @return
	 * @throws Exception
	 */
	@PostMapping(path = "/consume", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> getAllDonors(@RequestBody Donor donor) throws Exception {
		iDonorRepo.save(donor);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	/**
	 * 
	 */
	@PostMapping("/create")
	public void Create() {
		Admin a = new Admin("admin", "abcd");
		adminService.create(a);
	}

	/**
	 * @param adminName
	 * @param password
	 * @return
	 */
	@GetMapping(value = "/menu")
	public Boolean validateAdmin(@RequestParam("adminName") String adminName,
			@RequestParam("password") String password) {
		Admin admin = adminService.findByIdAndPath(adminName, password);
		return admin==null?false:true;
	}

	/**
	 * @return
	 */
	@GetMapping(value = "/patientList")
	public List<Patient> getPatient() {
		return patientService.getAllPatient();
	}

	@PostMapping(value="/addPatient")
	public String postActivity(@RequestBody Patient patient) {
//		LOG.info("Activity added successfully...");
		System.out.print(patient);
		patientService.create(patient);
		return "Success";
	}
	/**
	 * @param p
	 * @return
	 */
	@GetMapping(value = "/donorList/{bloodGroup}")
	public List<Donor> locateDonor(@PathVariable(value = "bloodGroup") String bloodGroup) {
		Patient p= new Patient();
		p.setBloodGroup(bloodGroup);
		System.out.println(bloodGroup);
		List<Donor> donor = new ArrayList<Donor>();
		SMSService smsservice = new SMSService();
		for (Donor d : donorService.getAllDonors()) {
			if (p.getBloodGroup().equalsIgnoreCase(d.getBloodGroup())) {
				donor.add(d);
				smsservice.sendSms(p.getPhoneNum(), "Hi! " + p.getPatientName() + " Your donor is " + d.getName()
						+ ".Please contact him on this " + d.getPhNum());
			}
		}
		System.out.println(donor);
		return donor;
	}

	/**
	 * @return
	 */
	@GetMapping(value = "/donors")
	public List<Donor> getDonor() {
		return donorService.getAllDonors();
	}
}
