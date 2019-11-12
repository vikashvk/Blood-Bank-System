package com.cg.assignment.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.assignment.model.Admin;

/**
 * @author v2
 *
 */
@Repository
public interface IAdminRepo extends MongoRepository<Admin, String>{

	public Admin findByAdminNameAndPassword(String adminName, String password);
}
