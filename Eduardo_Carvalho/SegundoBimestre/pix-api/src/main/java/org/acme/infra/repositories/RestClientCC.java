package org.acme.infra.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import org.acme.infra.dto.CCPixDTO;
import org.acme.infra.dto.CCResponseDTO;
import org.acme.infra.dto.CCTokenDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCC {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CCTokenDTO generateToken(Form form);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CCResponseDTO genPix(@HeaderParam("Authorization") String token, CCPixDTO pixDTO);

}
