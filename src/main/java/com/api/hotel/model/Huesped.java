package com.api.hotel.model;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Huesped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHuesped;

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String  nacionalidad;
    private String telefono;

    @OneToMany(cascade=CascadeType.ALL)

    private List<Reserva> reservas = new ArrayList<>();

    public void setId(long id){
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    } 

}
