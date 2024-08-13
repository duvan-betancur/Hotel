package com.api.hotel.service;



import org.springframework.stereotype.Service;
import com.api.hotel.model.Huesped;
import com.api.hotel.repositoty.HuespedRepositoy;

import java.util.List;

@Service
public class HuespedService {
   
   private final HuespedRepositoy huespedRepositoy;

    public HuespedService(HuespedRepositoy huespedRepositoy) {
        this.huespedRepositoy = huespedRepositoy;
    }

    //Mostrar huespedes
    public List<Huesped> getHuespedes() {
        return huespedRepositoy.findAll();
    }


    //Crear huesped
    public Huesped createHuesped(Huesped huesped){
        return huespedRepositoy.save(huesped);
    }

     //Editar huesped
     public Huesped editarHuesped(Huesped huesped){
        return huespedRepositoy.save(huesped);
    }

    //Eliminar huesped
    public void eliminarHuesped(long id){
        huespedRepositoy.delete(id);
    }

     

}
