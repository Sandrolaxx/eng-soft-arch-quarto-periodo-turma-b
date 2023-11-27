package org.acme.application.resources;

import org.acme.domain.dto.GenPixDTO;
import org.acme.domain.entities.Merchant;
import org.acme.domain.entities.Pix;
import org.acme.domain.usecases.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pix")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PixResource {
    
    private final PixService pixService;

    @Inject
    public PixResource(PixService pixService) {
        this.pixService = pixService;
    }

    @POST
    @Path("/qrCode")
    public String generate(GenPixDTO info) throws Exception {        
        Pix pix = new Pix(info.getKey(), info.getAmount());
        Merchant merchant = new Merchant(info.getMerchant().getPostalCode(), info.getMerchant().getName(), info.getMerchant().getCity());
        return pixService.generateQRCode(pix, merchant);
    }
}