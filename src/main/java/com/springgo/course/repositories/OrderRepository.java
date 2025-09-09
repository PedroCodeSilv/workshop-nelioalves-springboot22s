package com.springgo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springgo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
