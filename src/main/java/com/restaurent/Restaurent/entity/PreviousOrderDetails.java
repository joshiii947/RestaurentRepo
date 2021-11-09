package com.restaurent.Restaurent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PreviousOrderDetails {

    @Id
    private int id;

    private int orderId;

    private String userId;

    private String restaurentId;

    private String orderDetails;

    private String orderingTime;

    private String completionTime;
}
