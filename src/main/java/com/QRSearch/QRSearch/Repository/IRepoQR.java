/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.QRSearch.QRSearch.Repository;
import com.QRSearch.QRSearch.model.qrdata;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

        
public interface IRepoQR extends JpaRepository<qrdata, Long>{

    Optional<qrdata> findByInfoqr(String infoqr);

}
