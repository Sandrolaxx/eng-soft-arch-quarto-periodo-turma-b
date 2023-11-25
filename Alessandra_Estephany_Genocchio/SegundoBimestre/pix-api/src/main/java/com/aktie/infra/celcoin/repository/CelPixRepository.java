package com.aktie.infra.celcoin.repository;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.repositories.IPixVendorRepository;
import com.aktie.infra.celcoin.dto.CelPixDTO;
import com.aktie.infra.celcoin.dto.CelPixResponseDTO;
import com.aktie.infra.celcoin.dto.CelTokenDTO;
import com.aktie.infra.celcoin.mappers.CelPixMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CelPixRepository implements IPixVendorRepository {

    @Inject
    @RestClient
    RestClientCel restClient;

    @Override
    public PixDTO create(PixDTO pix) {
        CelPixDTO pixDTO = CelPixMapper.toVendorDTO(pix);

        CelPixResponseDTO response = restClient.handlePix(getToken(), pixDTO);

        pix.setQrCode(response.getQrCode());
        pix.setTransactionId(response.getTransactionId());

        return pix;
    }

    private String getToken() {
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CelTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer " + tokenDTO.getAccessToken();

        return token;
    }

}