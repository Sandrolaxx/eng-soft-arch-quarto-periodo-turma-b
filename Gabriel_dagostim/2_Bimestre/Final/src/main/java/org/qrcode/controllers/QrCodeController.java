package org.qrcode.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.qrcode.domain.dto.QrCodeDTO;
import org.qrcode.service.QrCodeService;

@Path("/v1")
public class QrCodeController {
    @Inject
    QrCodeService service;

    @POST
    @Path("/pix")
    @Produces({"application/json"})
    public QrCodeDTO create(QrCodeDTO dto) {
        return service.genQrCode(dto);
    }
}