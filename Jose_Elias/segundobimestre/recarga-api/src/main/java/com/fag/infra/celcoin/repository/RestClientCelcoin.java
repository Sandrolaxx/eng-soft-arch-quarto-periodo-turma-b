package com.fag.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.infra.celcoin.dto.CelOperatorsDTO;
import com.fag.infra.celcoin.dto.CelProductsDTO;
import com.fag.infra.celcoin.dto.CelRechargeDTO;
import com.fag.infra.celcoin.dto.CelRechargeResponseDTO;
import com.fag.infra.celcoin.dto.CelTokenDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCelcoin {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelTokenDTO generateToken(Form form);
    
    @GET
    @Path("/v5/transactions/topups/providers")
    CelOperatorsDTO listOperators(@HeaderParam("Authorization") String token,
            @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

    @GET
    @Path("/v5/transactions/topups/provider-values")
    CelProductsDTO listProducts(@HeaderParam("Authorization") String token,
    @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);
    
    @POST
    @Path("/v5/transactions/topups")
    @Consumes(MediaType.APPLICATION_JSON)
    CelRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token, CelRechargeDTO payload);

}
