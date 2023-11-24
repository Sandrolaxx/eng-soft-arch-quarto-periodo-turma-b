package com.aktie.controllers;

import com.aktie.domain.dto.CPixDTO;
import com.aktie.service.CelcoinPixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/pix")
public class CelcoinPixController {

    @Inject
    CelcoinPixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(CPixDTO dto) {
        return service.handlePix(dto);
    }

}