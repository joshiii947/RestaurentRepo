package com.restaurent.Restaurent.resources;

import lombok.Data;

@Data
public class OrderResource {
    private int restaurentId;
    private String orderDetails;
    private String distance;
}
