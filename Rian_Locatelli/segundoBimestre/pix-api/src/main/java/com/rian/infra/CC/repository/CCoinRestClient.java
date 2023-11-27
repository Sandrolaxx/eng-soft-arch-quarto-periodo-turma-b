package com.rian.infra.CC.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.rian.infra.CC.dto.CCoinPixReponseDTO;
import com.rian.infra.CC.dto.CCoinTokenDTO;
import com.rian.infra.CC.dto.PixCCoinDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Path;

//Interface de Cliente REST para interação com a PixCCoin
@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface CCoinRestClient {

    //Gera um token de autenticação para interação com a PixCCoin
    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CCoinPixReponseDTO handlePix(@HeaderParam("Authorization") PixCCoinDTO pix, String token);

    //Manipula a transação Pix 
    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CCoinTokenDTO generateToken(Form form);

    CCoinPixReponseDTO handlePix(String generateToken, PixCCoinDTO pixDTO);
}
