package com.fag.celcoin.presentation.controllers;

import com.fag.celcoin.domain.dto.PixDTO;
import com.fag.celcoin.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/qrcode")
public class PixController {

    @Inject
    PixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixDTO dto) {
        return service.handlePix(dto);
    }

}
