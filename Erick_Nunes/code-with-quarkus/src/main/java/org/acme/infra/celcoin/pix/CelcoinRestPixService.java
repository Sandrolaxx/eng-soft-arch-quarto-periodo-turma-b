package org.acme.infra.celcoin.pix;

import java.util.UUID;

import org.acme.domain.entities.Merchant;
import org.acme.domain.entities.Pix;
import org.acme.domain.usecases.PixService;
import org.acme.domain.usecases.TokenService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelcoinRestPixService implements PixService {

    private static final String PIX_QRCODE_API_URL = "https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static";
    
    private final TokenService tokenService;

    @Inject
    public CelcoinRestPixService(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @Override
    @Transactional
    public String generateQRCode(Pix pix, Merchant merchant) {
        // String token = tokenService.generate();
        
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy91c2VyZGF0YSI6IjQ3Mzk4MTAyNjExYTQ5MzA5MWI3IiwiZXhwIjoxNzAwNzcxNDgwLCJpc3MiOiJDZWxjb2luQVBJIiwiYXVkIjoiQ2VsY29pbkFQSSJ9.2mHWmxJSVt1bVErqYmf7wFAqHOSrg8fkDR6RExECeK0";

        CelcoinRequestStaticPix celcoinInfo = new CelcoinRequestStaticPix(
            pix.getKey(),
            pix.getAmount(),
            new CelcoinMerchant(
                merchant.getPostalCode(),
                merchant.getCity(),
                merchant.getName()),
            "testqrcodestaticcelcoin",
            "");

        Client client = ClientBuilder.newClient();
        
        Response response = client.target(PIX_QRCODE_API_URL)
                .request(MediaType.APPLICATION_JSON)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer ".concat(token))
                .post(Entity.entity(celcoinInfo, MediaType.APPLICATION_JSON));

        try {
            if (response.getStatus() == Response.Status.OK.getStatusCode()) {
                CelcoinResponseStaticPix qrCode = response.readEntity(CelcoinResponseStaticPix.class);
                this.persistResponse();
                return qrCode.getEmvqrcps();
            } else {
                return "Error: " + response.getStatus() + " \n" + response.getEntity().toString();
            }
        } finally {
            response.close();
            client.close();
        }
    }

    public void persistResponse() {
        // SALVAR NO BANCO DE DADOS
        
        // PixModel pix = PixModel();
        // pix.setId(UUID.randomUUID());
        // pix.setTransactionId(qrCode.getTransactionId());
        // pix.setEmv(qrCode.getEmvqrcps());
        // pix.setKey(pix.getKey());
        // pix.setAmount(pix.getAmount());
    }
}