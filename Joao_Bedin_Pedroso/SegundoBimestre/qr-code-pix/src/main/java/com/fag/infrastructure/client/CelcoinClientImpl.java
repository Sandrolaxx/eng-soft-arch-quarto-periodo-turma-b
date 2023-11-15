package com.fag.infrastructure.client;

import com.fag.application.dtos.QRCodeRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelcoinClientImpl implements CelcoinClient {

    private static final String AUTH_URL = "https://sandbox.openfinance.celcoin.dev/v5/token";
    private static final String QR_CODE_URL = "https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static";

   
    private static final String CLIENT_ID = "41b44ab9a56440.teste.celcoinapi.v5";
    private static final String CLIENT_SECRET = "";

    @Override
    public String authenticate() {
        Client client = ClientBuilder.newClient();
        client.close();
        return "token-gerado";
    }

    @Override
    public String generatePixQRCode(QRCodeRequest request, String token) {
        Client client = ClientBuilder.newClient();
        Response response = client.target(QR_CODE_URL)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + token)
                .post(Entity.entity(request, MediaType.APPLICATION_JSON));

        if (response.getStatusInfo().getFamily() == Response.Status.Family.SUCCESSFUL) {
            
            return response.readEntity(String.class);
        } else {
          
            throw new RuntimeException("Erro ao gerar QR Code Pix: " + response.getStatus());
        }
        
    }
}
