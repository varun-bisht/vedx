package com.varun.vedx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.vedx.model.Customer;
import com.varun.vedx.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
