package com.cg.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.assignment.model.Admin;
import com.cg.assignment.model.Donor;
import com.cg.assignment.model.Patient;
import com.cg.assignment.service.AdminService;
import com.cg.assignment.service.DonorService;
import com.cg.assignment.service.PatientService;
import com.cg.assignment.service.SMSService;

/**
 * @author v2
 *
 */
@Controller
public class BloodController {

	@Autowired
	PatientService patientService;
	@Autowired
	DonorService donorService;
	@Autowired
	AdminService adminService;
	@Autowired
	org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;

	/**
	 * 
	 * @param a
	 * @return
	 */
	@RequestMapping("/")
	public String welcome(@ModelAttribute("admin") Admin a) {

		return "login";
	}

	/**
	 * @param a
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(@ModelAttribute("admin") Admin a) {

		return "login";
	}

	/**
	 * @param admin
	 * @param p
	 * @param m
	 * @param httpSession
	 * @return
	 */
//	@RequestMapping("/menu")
//	public String index(@ModelAttribute("admin") Admin admin, @ModelAttribute("p") Patient p, Model m,
//			HttpSession httpSession) {
//		Admin a = adminService.searchById(admin.getAdminName());
//
//		if (a != null) {
//			if (passwordEncoder.matches(admin.getPassword(), a.getPassword())) {
//				return "menu";
//
//			} else {
//				m.addAttribute("msg", "Wrong Credentials.");
//				return "login";
//			}
//
//		} else {
//			m.addAttribute("msg", "OMG! Admin don't Exist.");
//
//		}
//
//		return "login";
//	}
	@GetMapping(value = "/menu")
	public String validateAdmin(@RequestParam("adminName") String adminName,
			@RequestParam("password") String password) {
		Admin admin = adminService.findByIdAndPath(adminName, password);
		return "menu";
	}

	/**
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/patientList", method = RequestMethod.GET)
	public String getPatient(ModelMap m) {

		List<Patient> patientList = patientService.getAllPatient();
		m.addAttribute("patientList", patientList);
		return "patientList";

	}

	/**
	 * @param p
	 * @return
	 */
	@RequestMapping("/add")
	public String addPatient(@ModelAttribute("p") Patient p) {
		return "add";
	}

	/**
	 * @param p
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/donorList", method = RequestMethod.POST)
	public String locateDonor(@ModelAttribute("p") Patient p, Model m) {
		patientService.create(p);
		System.out.println(p);
		List<Donor> donor = new ArrayList<Donor>();
		SMSService smsservice = new SMSService();
		for (Donor d : donorService.getAllDonors()) {
			if (p.getBloodGroup().equalsIgnoreCase(d.getBloodGroup())) {
				donor.add(d);
				smsservice.sendSms(p.getPhoneNum(), "Hi! " + p.getPatientName() + " Your donor is " + d.getName()
						+ ".Please contact him on this " + d.getPhNum());
			}
		}
		m.addAttribute("donorList", donor);
		return "donorList";
	}
	/**
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/donors", method = RequestMethod.GET)
	public String getDonor(ModelMap m) {

		List<Donor> donorList = donorService.getAllDonors();
		m.addAttribute("donorList", donorList);
		return "donorList";

	}

}
