package com.restaurent.Restaurent.dao;

import com.restaurent.Restaurent.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetails,Integer> {
}
