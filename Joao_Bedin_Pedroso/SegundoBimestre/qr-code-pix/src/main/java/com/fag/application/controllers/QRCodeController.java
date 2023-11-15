package com.fag.application.controllers;

import com.fag.application.dtos.QRCodeRequest;
import com.fag.application.dtos.QRCodeResponse;
import com.fag.domain.usecases.QRCodeUseCase;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/qrcode")
public class QRCodeController {

    @Inject
    QRCodeUseCase qrCodeUseCase;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response generateQRCode(QRCodeRequest request) {
        try {
            QRCodeResponse response = qrCodeUseCase.generateQRCode(request);
            return Response.ok(response).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
}
