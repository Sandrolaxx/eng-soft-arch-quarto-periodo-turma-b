package com.aktie.presentation.controllers;

import com.aktie.domain.dto.PixDTO;
import com.aktie.service.CelPixService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
@Path("/v1/pix")
public class CelPixController {
    @Inject
    CelPixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixDTO dto) {
        return service.handlePix(dto);
    }
}
