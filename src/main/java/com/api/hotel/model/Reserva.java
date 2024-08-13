package com.api.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idReserva;

    private String fechaEntrada;
    private String fechaSalida;
    private double precio;
    private String formaPago;

}
