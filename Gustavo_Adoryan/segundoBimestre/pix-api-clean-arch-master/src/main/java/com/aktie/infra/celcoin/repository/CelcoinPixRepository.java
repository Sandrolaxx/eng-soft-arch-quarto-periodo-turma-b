package com.aktie.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.repositories.IPixRepository;
import com.aktie.infra.celcoin.dto.CelcoinPixDTO;
import com.aktie.infra.celcoin.dto.CelcoinPixResponseDTO;
import com.aktie.infra.celcoin.dto.CelcoinTokenDTO;
import com.aktie.infra.celcoin.mappers.CelcoinPixMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

@ApplicationScoped
public class CelcoinPixRepository implements IPixRepository {

    @Inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public PixDTO create(PixDTO dto) {

        CelcoinPixDTO pixDTO = CelcoinPixMapper.toPixDTO(dto);

        CelcoinPixResponseDTO response = restClient.genPix(getToken(), pixDTO);

        dto.setEmv(response.getEmv());
        dto.setTransactionId(response.getTransactionId());

        return dto;

    }

    private String getToken() {
        
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CelcoinTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer " + tokenDTO.getAccessToken();

        return token;

    }
}
