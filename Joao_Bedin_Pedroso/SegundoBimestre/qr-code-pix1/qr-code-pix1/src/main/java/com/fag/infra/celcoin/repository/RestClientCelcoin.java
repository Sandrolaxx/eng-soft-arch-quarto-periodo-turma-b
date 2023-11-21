package com.fag.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.domain.dto.PixDTO;
import com.fag.infra.celcoin.dto.CelcoinTokenDTO;
import com.fag.infra.celcoin.dto.PixResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCelcoin {

   @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelcoinTokenDTO generateToken(Form form);

    //Adicionar request de geração QR Code
    @POST
    @Path("pix/v1/brcode/static")
    PixResponse nomeMetodo(PixDTO dto, @HeaderParam("Authorization") String token);

}
