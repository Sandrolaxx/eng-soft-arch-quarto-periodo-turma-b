package com.fag.infra.mercadopago.repository;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixRepository;
import com.fag.infra.mercadopago.dto.MpPixDTO;
import com.fag.infra.mercadopago.dto.MpPixPayerDTO;
import com.fag.infra.mercadopago.dto.MpPixResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MpPixRepository implements IPixRepository{
    
    @Inject
    @RestClient
    RestClientMp restClient;

    @Override
    public PixDTO create(PixDTO dto) {
        String token = "Bearer TEST-2735944581844031-111421-5f0f5ac9cf70d1d3574d093e93857bdf-1375950268";

        MpPixPayerDTO payerDTO = new MpPixPayerDTO();
        MpPixDTO pixDTO = new MpPixDTO();
        payerDTO.setEmail(dto.getEmail());

        pixDTO.setAmount(dto.getAmount());
        pixDTO.setDescription(dto.getDescription());
        pixDTO.setPaymentMethodId("pix");
        pixDTO.setPayer(payerDTO);
        
        MpPixResponse response = restClient.createPix(token, "1231223", pixDTO);

        dto.setEmv(response.getPoi().getTrxData().getEmv());

        return dto;
    }
}
