package org.qrcode.infra.celcoin.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import org.qrcode.infra.celcoin.dto.CelcoinPixRequestDTO;
import org.qrcode.infra.celcoin.dto.CelcoinPixResponseDTO;
import org.qrcode.infra.celcoin.dto.CelcoinTokenResponseDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(
        configKey = "base-uri-cc"
)
public interface CelcoinRestClient {
    @POST
    @Path("/v5/token")
    @Consumes({"application/x-www-form-urlencoded"})
    CelcoinTokenResponseDTO getToken(@FormParam("client_id") String clientId, @FormParam("grant_type") String grantType, @FormParam("client_secret") String clientSecret);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes({"application/json"})
    CelcoinPixResponseDTO createStaticPix(@HeaderParam("Authorization") String token, CelcoinPixRequestDTO request);
}