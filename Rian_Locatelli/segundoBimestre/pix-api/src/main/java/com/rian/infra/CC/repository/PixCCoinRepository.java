package com.rian.infra.CC.repository;

import com.rian.domain.dto.PixCelcoinDTO;
import com.rian.domain.repositories.IPixVendorRepository;
import com.rian.infra.CC.dto.CCoinPixReponseDTO;
import com.rian.infra.CC.dto.CCoinTokenDTO;
import com.rian.infra.CC.dto.PixCCoinDTO;
import com.rian.infra.CC.mapper.PixCCoinMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

//Repositório para integração com a API PixCCoin, responsável por criar transações Pix
@ApplicationScoped
public class PixCCoinRepository implements IPixVendorRepository {

    @Inject
    CCoinRestClient restClient;

    //Cria uma transação Pix utilizando dados fornecidos e interage com a PixCCoin
    @Override
    public PixCelcoinDTO create(PixCelcoinDTO pix) {
        PixCCoinDTO pixDTO = PixCCoinMapper.toVendorDTO(pix);
        CCoinPixReponseDTO response = restClient.handlePix(generateToken(), pixDTO);
        pix.setQrCode(response.getQrCode());
        pix.setTransactionId(response.getTransactionId());
        return pix;
    }

    //Gera um token de autenticação para interação com a PixCCoin
    private String generateToken() {
        Form form = new Form();
        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CCoinTokenDTO tokenDTO = restClient.generateToken(form);
        return "Bearer " + tokenDTO.getAccessToken();
    }
}
