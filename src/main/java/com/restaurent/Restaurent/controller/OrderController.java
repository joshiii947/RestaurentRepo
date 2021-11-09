package com.restaurent.Restaurent.controller;

import com.restaurent.Restaurent.resources.OrderResource;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @GetMapping("/getOrderDetails/{id}")
    public void getOrderDetailsWithOrderId(@RequestParam String id){


    }

    @PostMapping("/provideOrderDetails")
    public void provideOrderDetails(@RequestBody OrderResource orderResource){

    }
}
