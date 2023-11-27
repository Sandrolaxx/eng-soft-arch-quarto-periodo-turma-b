package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.domain.dto.PixDTO;
import org.acme.service.PixService;

@Path("/v1")
public class PixController {

    @Inject
    PixService service;
    @Path("/pix")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PixDTO dto) {
        return service.genPix(dto);
    }

}
