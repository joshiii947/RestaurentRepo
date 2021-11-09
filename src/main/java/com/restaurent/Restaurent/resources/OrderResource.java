package com.restaurent.Restaurent.resources;

import lombok.Data;

@Data
public class OrderResource {
    private String restaurentId;
    private String orderDetails;
    private String distance;
}
