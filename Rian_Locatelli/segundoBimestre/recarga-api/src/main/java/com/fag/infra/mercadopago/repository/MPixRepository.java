package com.fag.infra.mercadopago.repository;

import java.util.UUID;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.MPPixDTO;
import com.fag.domain.repositories.IPixRepository;
import com.fag.domain.repositories.MPIPixRepository;
import com.fag.infra.mercadopago.dto.MPixDTO;
import com.fag.infra.mercadopago.dto.MPPixPayerDTO;
import com.fag.infra.mercadopago.dto.MPPixResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MPixRepository implements MPIPixRepository {

    @Inject
    @RestClient
    MPRestClient restClient;

    @ConfigProperty(name = "mp.token")
    String mpToken;

    private final String MP_PAYMENT_ID = "pix";

    @Override
    public MPixDTO create(MPixDTO dto) {
        
        String token = "Bearer TEST-2939c135-d494-4706-bddf-529fe93c0da0";
        String idempotencyKey = UUID.randomUUID().toString();

        MPixPayerDTO payerDTO = new MPPixPayerDTO();
        MPixDTO pixDTO = new MPixDTO();
        payerDTO.setEmail(dto.getEmail());

        pixDTO.setAmount(dto.getAmount());
        pixDTO.setDescription(dto.getDescription());
        pixDTO.setPaymentMethodId(MP_PAYMENT_ID);
        pixDTO.setPayer(payerDTO);

        MPPixResponse response = restClient.createPix(token, idempotencyKey, pixDTO);

        dto.setEmv(response.getPoi().getTrxData().getEmv());
        dto.setBase64(response.getPoi().getTrxData().getBase64());

        return dto;
    }
}
