package com.db.hack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.db.hack.entity.Customer;

/**
 * A sample repository for Customer entities.
 *
 */
@Service("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
