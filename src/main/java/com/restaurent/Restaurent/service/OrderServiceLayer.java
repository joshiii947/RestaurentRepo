package com.restaurent.Restaurent.service;

import com.restaurent.Restaurent.assemblers.OrderRepositoryAssembler;
import com.restaurent.Restaurent.dao.OrderDetailsRepository;
import com.restaurent.Restaurent.dao.OrderRepository;
import com.restaurent.Restaurent.entity.OrderDetails;
import com.restaurent.Restaurent.resources.OrderResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceLayer {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    private OrderRepositoryAssembler orderRepositoryAssembler;

    public List<OrderDetails> createOrder(OrderResource orderResource){

        List<OrderDetails> orderDetails=orderRepositoryAssembler.getOrderDetailsWithOrderResource(orderResource);
        return orderRepository.saveAll(orderDetails);
    }

    private void checkWheatherOrderFesible(OrderResource orderResource){
        // need to check wheather the order is fesible or not in the repository layer
    }

    

}
