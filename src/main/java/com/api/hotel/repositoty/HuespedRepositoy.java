package com.api.hotel.repositoty;

import java.util.List;

import com.api.hotel.model.Huesped;

public interface HuespedRepositoy{

    

    Huesped save(Huesped huesped);

    void delete(long id);

    List<Huesped> findAll();

}
