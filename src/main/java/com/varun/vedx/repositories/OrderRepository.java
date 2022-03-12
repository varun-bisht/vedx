package com.varun.vedx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.vedx.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
