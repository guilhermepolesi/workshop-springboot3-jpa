package com.educandoweb.Webservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Webservicesspringbootjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
