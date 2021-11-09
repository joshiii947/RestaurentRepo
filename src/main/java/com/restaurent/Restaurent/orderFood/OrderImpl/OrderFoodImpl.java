package com.restaurent.Restaurent.orderFood.OrderImpl;

import com.restaurent.Restaurent.dao.OrderRepository;
import com.restaurent.Restaurent.dao.RestaurentRepository;
import com.restaurent.Restaurent.entity.Restaurent;
import com.restaurent.Restaurent.orderFood.OrderFood;
import com.restaurent.Restaurent.service.OrderServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderFoodImpl implements OrderFood {

    @Autowired
    private OrderServiceLayer orderServiceLayer;

    @Override
    public void orderFood(String distance, String restaurentId, String orderDetails) {
        Restaurent restaurentList = orderServiceLayer.getAllOrderWithRestaurent(restaurentId);


    }
}
