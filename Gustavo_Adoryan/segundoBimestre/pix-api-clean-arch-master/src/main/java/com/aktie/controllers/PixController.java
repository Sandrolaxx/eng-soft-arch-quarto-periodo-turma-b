package com.aktie.controllers;

import com.aktie.domain.dto.PixDTO;
import com.aktie.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/pix")
public class PixController {

    @Inject
    PixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PixDTO dto) {
        return service.genPix(dto);
    }
    
}
