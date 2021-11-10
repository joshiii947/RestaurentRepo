package com.restaurent.Restaurent.assemblers;

import com.restaurent.Restaurent.entity.OrderDetails;
import com.restaurent.Restaurent.resources.OrderResource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OrderRepositoryAssembler {

    public List<OrderDetails> getOrderDetailsWithOrderResource(OrderResource orderResource){
        List<OrderDetails> list=new ArrayList<>();
        String order=orderResource.getOrderDetails();
        String[] ordersList=order.split(",");
        for(String str:ordersList){
            OrderDetails orderDetails=new OrderDetails();
            orderDetails.setOrderTime(String.valueOf(new Date()));
            orderDetails.setRestaurentId(orderResource.getRestaurentId());
            orderDetails.setCompletionTime(calcaulateTimeToCompleteOrder(orderResource));
            list.add(orderDetails);
        }
        return list;
    }

    private String calcaulateTimeToCompleteOrder(OrderResource orderResource){
        // need to calcaulte the time when the next order will be complete as soon as possible
        return "11";
    }
}
