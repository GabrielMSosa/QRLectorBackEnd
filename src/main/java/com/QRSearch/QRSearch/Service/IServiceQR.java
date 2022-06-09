/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.QRSearch.QRSearch.Service;


import com.QRSearch.QRSearch.model.qrdata;
import java.util.List;


/**
 *
 * @author Voolkia
 */
public interface IServiceQR {
    
    
    public List<qrdata> traerTodo(Long ancho);
    public qrdata BuscarQr(String data);
    public String cargarQR(qrdata info);
    
    
}
