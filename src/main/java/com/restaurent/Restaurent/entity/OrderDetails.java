package com.restaurent.Restaurent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderDetails {

    @Id
    @GeneratedValue
    private int id;
    private int restaurentId;
    private String orderTime;
    private String completionTime;
}
