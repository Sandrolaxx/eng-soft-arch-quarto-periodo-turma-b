package com.fag.presentation.controllers;

import com.fag.domain.dto.PixDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import com.fag.service.PixService;


@Path("/v1")
public class PixController {
    
    @Inject
    PixService service;

    @POST
    @Path("/pix/mp")
    @Produces(MediaType.APPLICATION_JSON)
    public PixDTO create(PixDTO dto) {
        return service.QRCode(dto);
    }

}
