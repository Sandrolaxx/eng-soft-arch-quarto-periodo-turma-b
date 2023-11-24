package com.ryan.projetofinal.presentation.controllers;

import com.ryan.projetofinal.domain.dto.PixDTO;
import com.ryan.projetofinal.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/v1")
public class PixController {

    @Inject
    PixService service;

    @POST
    @Path("/pix/mp")
    @Produces(MediaType.APPLICATION_JSON)
    public PixDTO create(PixDTO dto) {
        return service.genPix(dto);
    }
}