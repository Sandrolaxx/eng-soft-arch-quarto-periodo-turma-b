package com.aktie.infra.celcoin.repository;

import com.aktie.infra.celcoin.dto.CelPixDTO;
import com.aktie.infra.celcoin.dto.CelPixResponseDTO;
import com.aktie.infra.celcoin.dto.CelTokenDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCel {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelTokenDTO generateToken(Form form);

    @POST

    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CelPixResponseDTO handlePix(@HeaderParam("Authorization") String token, CelPixDTO pix);

}