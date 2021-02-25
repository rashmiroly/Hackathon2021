package com.db.hack.repository;

import org.springframework.data.repository.CrudRepository;

import com.db.hack.entity.Customer;

/**
 * A sample repository for Customer entities.
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
