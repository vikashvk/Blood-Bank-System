package com.cg.assignment.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.assignment.model.Donor;

/**
 * @author v2
 *
 */
public interface IDonorRepo  extends MongoRepository< Donor,String> {
	
}
