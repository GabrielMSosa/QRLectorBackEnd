/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.QRSearch.QRSearch.Service;

import com.QRSearch.QRSearch.Repository.IRepoQR;
import com.QRSearch.QRSearch.model.qrdata;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Voolkia
 */
@Service
public class ServiQR implements IServiceQR{
    @Autowired
    private IRepoQR repo;
    
    
    @Override
    public List<qrdata> traerTodo(Long ancho) {
        List<qrdata> datoper= new ArrayList<>();
        
        
        for (int i = 0; i < ancho; i++) {
            Long x =Long.valueOf(i);
            Optional<qrdata> datos=repo.findById(x);
            if(datos.isEmpty()!=false){
            datoper.add(datos.get());}
        }
        return datoper;
        
            
            
        }
        
        
        
        
    

    @Override
    public qrdata BuscarQr(String data) {

        Optional<qrdata> x=repo.findByInfoqr(data);
        
        return x.get();
        
        
        
    }

    @Override
    public String cargarQR(qrdata info) {
    
        repo.save(info);
        return "Guardado Exitosamente";
        
    }
    
    
}
