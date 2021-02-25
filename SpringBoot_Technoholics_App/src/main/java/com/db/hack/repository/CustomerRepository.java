package com.db.hack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.hack.entity.Customer;

/**
 * A sample repository for Customer entities.
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
