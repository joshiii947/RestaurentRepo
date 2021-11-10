package com.restaurent.Restaurent.orderFood.OrderImpl;

import com.restaurent.Restaurent.dao.RestaurentRepository;
import com.restaurent.Restaurent.entity.Restaurent;
import com.restaurent.Restaurent.orderFood.RestaurentCreation;
import org.springframework.beans.factory.annotation.Autowired;

public class RestaurentCreationImpl implements RestaurentCreation {

    @Autowired
    private RestaurentRepository restaurentRepository;

    @Override
    public String createRestaurent(String name) {

        return "CREATES SUCCESSFULLY";
    }


    private Restaurent creteRestaurentResource(String name){
        Restaurent restaurent=new Restaurent();
        restaurent.setRestaurentName(name);

        return restaurent;
    }
}
