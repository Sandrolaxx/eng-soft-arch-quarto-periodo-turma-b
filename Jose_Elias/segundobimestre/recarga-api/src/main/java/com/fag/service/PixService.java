/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.usecases.CreatePixQR;
import com.fag.infra.celcoin.usecases.PixCel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author molin
 */
@ApplicationScoped
public class PixService {

    @Inject
    PixCel pixCelcoin;

    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePixQR createPix = new CreatePixQR(pixCelcoin);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}
