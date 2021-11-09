package com.restaurent.Restaurent.service;

import com.restaurent.Restaurent.dao.OrderRepository;
import com.restaurent.Restaurent.dao.RestaurentRepository;
import com.restaurent.Restaurent.entity.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceLayer {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestaurentRepository restaurentRepository;

    public Restaurent getAllOrderWithRestaurent(String id){
        int restaurentId=Integer.parseInt(id);
        return restaurentRepository.getById(restaurentId);
    }
}
