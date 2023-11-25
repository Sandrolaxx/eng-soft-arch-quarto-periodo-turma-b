package org.acme.infra.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import org.acme.domain.dto.PixDTO;
import org.acme.domain.repositories.IPixRepository;
import org.acme.infra.dto.CCPixDTO;
import org.acme.infra.dto.CCResponseDTO;
import org.acme.infra.dto.CCTokenDTO;
import org.acme.infra.mappers.CCPixMapper;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CCPixRepository implements IPixRepository {
    @Inject
    @RestClient
    RestClientCC restClient;

    @Override
    public PixDTO create(PixDTO dto) {

        CCPixDTO pixDTO = CCPixMapper.toVendorDTO(dto);

        CCResponseDTO response = restClient.genPix(getToken(), pixDTO);

        dto.setEmv(response.getEmv());

        return dto;

    }

    private String getToken() {

        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CCTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer " + tokenDTO.getAccessToken();

        return token;

    }
}
