package com.fag.controllers;

import com.fag.domain.dto.PixDTO;
import com.fag.service.PixService;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/pix")
public class PixController {

    @Inject
    PixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handleCreatePix(PixDTO dto) {
        return service.genQRCode(dto);
    }

}
    

