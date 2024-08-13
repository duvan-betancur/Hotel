package com.api.hotel.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.hotel.model.Reserva;



public interface ReservaRepositoty extends JpaRepository<Reserva, Long>{

}
