/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.services;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixDataRepository;
import com.fag.domain.repositories.IPixVendor;
import com.fag.domain.usecases.CreatePixQR;
import com.fag.infra.celcoin.usecases.PixCelcoin;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author joseem
 */
@ApplicationScoped
public class PixService {
    @Inject
    PixCelcoin pixCelcoin;

    @Inject
    IPixDataRepository dataRepo;
    
    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePixQR createPixQR = new CreatePixQR(pixCelcoin, dataRepo);

        PixDTO pixFeito = createPixQR.execute(dto);

        return Response.ok(pixFeito).build();
    }
}
