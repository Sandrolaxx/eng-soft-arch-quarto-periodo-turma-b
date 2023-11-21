package com.fag.infra.celcoin.repository;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixRepository;
import com.fag.infra.celcoin.dto.CelcoinTokenDTO;
import com.fag.infra.celcoin.dto.PixResponse;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

public class CelocinPixRepository implements IPixRepository {

    @Inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public PixDTO create(PixDTO dto){
    
        Form form = new Form();
        // Adicionar as 3 credenciais de geração do token - Body Params - https://developers.celcoin.com.br/reference/post_v5-token
        // form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CelcoinTokenDTO token = restClient.generateToken(form);

        PixResponse response = restClient.nomeMetodo(dto, "Bearer " + token.getAccessToken());
        
        dto.setEmv(response.getEmv());

        return dto;

    }

}

