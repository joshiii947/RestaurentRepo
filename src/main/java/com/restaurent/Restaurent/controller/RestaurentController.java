package com.restaurent.Restaurent.controller;

import com.restaurent.Restaurent.entity.Restaurent;
import com.restaurent.Restaurent.resources.RestaurentResource;
import com.restaurent.Restaurent.service.RestaurentServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurentController {

    @Autowired
    public RestaurentServiceLayer restaurentServiceLayer;


    @PostMapping("/createNewRestaurent")
    public Restaurent createRestaurent(@RequestBody RestaurentResource restaurentResource){
        return restaurentServiceLayer.checkAndAddRestaurent(restaurentResource.getName());
    }

}
