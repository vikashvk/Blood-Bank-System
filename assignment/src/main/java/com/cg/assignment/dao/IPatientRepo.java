package com.cg.assignment.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.assignment.model.Patient;

/**
 * @author v2
 *
 */
public interface IPatientRepo extends MongoRepository<Patient, String>{

}
