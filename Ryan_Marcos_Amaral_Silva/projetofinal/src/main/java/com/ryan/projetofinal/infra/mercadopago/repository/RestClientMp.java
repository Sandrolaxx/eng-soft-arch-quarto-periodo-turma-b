package com.ryan.projetofinal.infra.mercadopago.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.ryan.projetofinal.infra.mercadopago.dto.MpPixDTO;
import com.ryan.projetofinal.infra.mercadopago.dto.MpPixPoiDTO;
import com.ryan.projetofinal.infra.mercadopago.dto.MpPixResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://api.mercadopago.com")
public interface RestClientMp {

    @POST
    @Path("/ryan/payments")
    @Consumes(MediaType.APPLICATION_JSON)
    MpPixResponse createPix(
            @HeaderParam("Authorization") String token,
            @HeaderParam("X-Idempotency-Key") String idempotency,
            MpPixDTO payload);

}
