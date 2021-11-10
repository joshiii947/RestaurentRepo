package com.restaurent.Restaurent.dao;

import com.restaurent.Restaurent.entity.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurentRepository extends JpaRepository<Restaurent,Integer> {

    List<Restaurent> findByRestaurentName(String name);
}
