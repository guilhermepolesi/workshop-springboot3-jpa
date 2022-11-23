package com.educandoweb.Webservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Webservicesspringbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
