package com.db.hack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.db.hack.entity.Customer;

/**
 * A sample repository for Customer entities.
 *
 */
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
