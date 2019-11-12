package com.cg.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment.dao.IPatientRepo;
import com.cg.assignment.model.Patient;

@Service
public class PatientService {
	@Autowired
	IPatientRepo patientRepo;

	public void create(Patient p) {
		patientRepo.save(p);
	}
	public List<Patient> getAllPatient(){
		return patientRepo.findAll();
	}
}
