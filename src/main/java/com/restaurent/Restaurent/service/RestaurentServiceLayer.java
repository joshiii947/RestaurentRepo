package com.restaurent.Restaurent.service;

import com.restaurent.Restaurent.dao.RestaurentRepository;
import com.restaurent.Restaurent.entity.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurentServiceLayer {

    @Autowired
    private RestaurentRepository restaurentRepository;

    public Restaurent checkAndAddRestaurent(String name){
        List<Restaurent> list=findByRestaurentName(name);
        if(list.size()!=0)
            return list.get(0);
        return createRestaurent(name);
    }

    private List<Restaurent> findByRestaurentName(String name){
        return restaurentRepository.findByRestaurentName(name);
    }

    private Restaurent createRestaurent(String name){
        Restaurent restaurent=new Restaurent();
        restaurent.setRestaurentName(name);

        return restaurentRepository.save(restaurent);
    }
}
