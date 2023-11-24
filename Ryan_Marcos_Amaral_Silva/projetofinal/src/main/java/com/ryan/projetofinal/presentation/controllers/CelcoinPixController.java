package com.ryan.projetofinal.presentation.controllers;

import com.ryan.projetofinal.domain.dto.CoinPixDTO;
import com.ryan.projetofinal.service.CelcoinPixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/ryan/pix")
public class CelcoinPixController {

    @Inject
    CelcoinPixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(CoinPixDTO dto) {
        return service.handlePix(dto);
    }

}