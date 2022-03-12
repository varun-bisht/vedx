package com.varun.vedx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.vedx.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
