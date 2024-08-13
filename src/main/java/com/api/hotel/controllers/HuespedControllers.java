package com.api.hotel.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.hotel.model.Huesped;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.hotel.service.HuespedService;




@RestController
@RequestMapping("/huespedes")
public class HuespedControllers {

   private final  HuespedService huespedService;


    public HuespedControllers(HuespedService huespedService) {
        this.huespedService = huespedService;
    }

    @GetMapping
    public List<Huesped> listarTodos(){
        return huespedService.getHuespedes();
    }

    @PostMapping
    public Huesped crearHuesped(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    @PostMapping("/editar/{id}")
    public Huesped editarHuesped(@RequestBody Huesped huesped, @PathVariable long id){
        huesped.setId(id);
        return huespedService.editarHuesped(huesped);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminarHuesped(@PathVariable long id){
         huespedService.eliminarHuesped(id);
        
    }
}
 