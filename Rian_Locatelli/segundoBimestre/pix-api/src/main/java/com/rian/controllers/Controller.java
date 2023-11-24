package com.rian.controllers;

import com.rian.domain.dto.PixCelcoinDTO;
import com.rian.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

//Mapeia para o caminho "/v1/pix"
@Path("/v1/pix")
public class Controller {

    @Inject
    PixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixCelcoinDTO  dto) {
        return service.handlePix(dto);
    }

}
