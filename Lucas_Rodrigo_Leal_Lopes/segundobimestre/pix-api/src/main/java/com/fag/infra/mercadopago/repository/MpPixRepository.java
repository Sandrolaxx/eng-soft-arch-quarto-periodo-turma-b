package com.fag.infra.mercadopago.repository; //pode colocar biblioteca externa

import java.util.UUID;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixRepositoty;
import com.fag.infra.mercadopago.dto.MpPixPayerDTO;
import com.fag.infra.mercadopago.dto.MpPixDTO;
import com.fag.infra.mercadopago.dto.MpPixResponse;
import jakarta.enterprise.context.ApplicationScoped;


import jakarta.inject.Inject;
@ApplicationScoped
public class MpPixRepository implements IPixRepositoty {
    
    @Inject
    @RestClient
    RestClientMp restClient;

    @Override
    public PixDTO create(PixDTO dto){
       String token = "Bearer TEST-5656118351262977-112110-a2fc6adaec74d7ca5f339fb68e5e563e-1389117287";
       String idempotencyKey = UUID.randomUUID().toString();

       MpPixPayerDTO payerDTO = new MpPixPayerDTO();
       MpPixDTO pixDTO = new MpPixDTO();
       payerDTO.setEmail(dto.getEmail());

       pixDTO.setAmount(dto.getAmount());
       pixDTO.setDescription(dto.getDescription());
       pixDTO.setPaymentMethodId("pix");
       pixDTO.setPayer(payerDTO);

       MpPixResponse response = restClient.createPix(token, idempotencyKey, pixDTO);
       
       dto.setEmv(response.getPoi().getTrxData().getEmv());
       dto.setBase64(response.getPoi().getTrxData().getBase64());

       return dto;
    }
    
}