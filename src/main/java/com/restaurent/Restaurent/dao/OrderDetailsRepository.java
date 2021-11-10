package com.restaurent.Restaurent.dao;

import com.restaurent.Restaurent.entity.OrderDetails;
import com.restaurent.Restaurent.entity.PreviousOrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailsRepository extends JpaRepository<PreviousOrderDetails,Integer> {

    List<OrderDetails> findAllByRestaurentId(int restaurentId);
}
