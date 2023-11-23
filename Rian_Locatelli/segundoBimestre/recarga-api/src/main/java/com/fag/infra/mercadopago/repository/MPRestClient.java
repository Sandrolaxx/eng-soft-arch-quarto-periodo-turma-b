package com.fag.infra.mercadopago.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.infra.mercadopago.dto.MPPixDTO;
import com.fag.infra.mercadopago.dto.MPPixResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(configKey = "base-uri-mp")
public interface MPRestClient {

    @POST
    @Path("/v1/payments")
    @Consumes(MediaType.APPLICATION_JSON)
    MPPixResponse createPix(
            @HeaderParam("Authorization") String token,
            @HeaderParam("X-Idempotency-Key") String idempotency,
            MPPixDTO payload);

}
