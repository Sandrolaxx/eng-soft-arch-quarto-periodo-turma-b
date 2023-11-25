package main.java.com.fag.presentation.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import main.java.com.fag.domain.dto.PixDTO;
import main.java.com.fag.service.PixService;


@Path("/v1/pix")
public class PixController {

    @Inject
    PixService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixDTO dto) {
        return service.handlePix(dto);
    }

}
