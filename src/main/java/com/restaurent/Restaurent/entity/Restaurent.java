package com.restaurent.Restaurent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurent {
    @Id
    @GeneratedValue
    private int id;
    private String restaurentName;
    private String slotsBooked;
}
