package org.acme.infra.celcoin.token;

import org.acme.domain.usecases.TokenService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelcoinRestTokenService implements TokenService {

    private static final String TOKEN_API_URL = "https://sandbox.openfinance.celcoin.dev/v5/token"; // COLOCAR NO APPLICATION.PROPERTIES

    @Override
    public String generate() {
        Client client = ClientBuilder.newClient();

        Form form = new Form();
        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");
        form.param("grant_type", "client_credentials");

        Response response = client.target(TOKEN_API_URL)
                .request(MediaType.MULTIPART_FORM_DATA_TYPE)
                .post(Entity.entity(form, MediaType.MULTIPART_FORM_DATA_TYPE));

        client.close();

        // if (response.getStatus() != HttpStatus.SC_NO_CONTENT) {
        //     LOGGER.info("Response Body: {}", response.readEntity(String.class));
        // }

        // if (response.getStatus() == Response.Status.OK.getStatusCode()) {
        //     return response.readEntity(String.class);
        // } else {
        //     return "Error: " + response.getStatus();
        // }

        return response.getEntity().toString();
    }
}