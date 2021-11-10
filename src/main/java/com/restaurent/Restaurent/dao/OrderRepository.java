package com.restaurent.Restaurent.dao;

import com.restaurent.Restaurent.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderDetails,Integer> {

    List<OrderDetails> findById(int id);

    List<OrderDetails> findByRestaurentId(int id);

}
