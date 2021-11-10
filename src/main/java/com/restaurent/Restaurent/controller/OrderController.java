package com.restaurent.Restaurent.controller;

import com.restaurent.Restaurent.resources.OrderResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {



    @GetMapping("/getOrderDetails/{id}")
    public String getOrderDetailsWithOrderId(@RequestParam String id){

        return "OK";
    }

    @PostMapping("/provideOrderDetails")
    public String provideOrderDetails(@RequestBody OrderResource orderResource){

        return "OK";
    }
}
