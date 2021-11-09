package com.restaurent.Restaurent.dao;

import com.restaurent.Restaurent.entity.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurentRepository extends JpaRepository<Restaurent,Integer> {
}
