package com.ryan.projetofinal.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.ryan.projetofinal.infra.celcoin.dto.CelcoinPixDTO;
import com.ryan.projetofinal.infra.celcoin.dto.CelcoinPixResponseDTO;
import com.ryan.projetofinal.infra.celcoin.dto.CelcoinTokenDTO;
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

  @POST
  @Path("/pix/v1/brcode/static")
  @Consumes(MediaType.APPLICATION_JSON)
  CelcoinPixResponseDTO handlePix(@HeaderParam("Authorization") String token, CelcoinPixDTO pix);

}