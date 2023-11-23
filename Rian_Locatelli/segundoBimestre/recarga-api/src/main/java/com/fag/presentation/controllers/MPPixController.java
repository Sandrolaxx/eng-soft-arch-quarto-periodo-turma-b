package com.fag.presentation.controllers;

import com.fag.domain.dto.PixDTO;
import com.fag.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1")
public class MPPixController {

    @Inject
    PixService service;

    @POST
    @Path("/pix")
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PixDTO dto) {
        return service.handlePix(dto); 
    }
}
