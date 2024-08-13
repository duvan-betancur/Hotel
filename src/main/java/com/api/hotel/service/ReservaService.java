package com.api.hotel.service;


import org.springframework.stereotype.Service;
import java.util.List;
import com.api.hotel.model.Reserva;


@Service
public class ReservaService {

       private final ReservaRepositoy reservaRepositoy;

    public ReservaService(ReservaRepositoy reservaRepositoy) {
        this.reservaRepositoy = reservaRepositoy;
    }

     //Mostrar huespedes
     public List<Reserva> getReservas() {
        return reservaRepositoy.findAll();
    }


    //Crear huesped
    public Reserva createReserva(Reserva reserva){
        return reservaRepositoy.save(reserva);
    }

      //Editar huesped
      public Reserva editarReserva(Reserva reserva){
        return reservaRepositoy.save(reserva);
    }

   

}
