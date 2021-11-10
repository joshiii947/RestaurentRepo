package com.restaurent.Restaurent.controller;

import com.restaurent.Restaurent.resources.RestaurentResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurentController {



    @PostMapping("/createNewRestaurent")
    public String createRestaurent(@RequestBody RestaurentResource restaurentResource){

        return "CREATED SUCCESFULLY";
    }

}
