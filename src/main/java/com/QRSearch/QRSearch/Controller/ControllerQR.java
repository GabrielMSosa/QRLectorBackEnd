/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QRSearch.QRSearch.Controller;

import com.QRSearch.QRSearch.Service.IServiceQR;
import com.QRSearch.QRSearch.model.qrdata;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Voolkia
 */
@RestController
public class ControllerQR {
    @Autowired
    private IServiceQR servi;



  //@CrossOrigin(origins = "https://portfolio2-a6e86.web.app/")
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/buscar/qr/{qrdatos}")
    public qrdata Buscar(@PathVariable String qrdatos){
    
    return servi.BuscarQr(qrdatos);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping("/cargar")
    public String cargar(@RequestBody qrdata datain){
    
    return servi.cargarQR(datain);
    }
    
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/buscar/qrtam/{tama}")
    public List<qrdata> TraerTam(@PathVariable Long tama){
    
    return servi.traerTodo(tama);
    
    }
    
    
}
