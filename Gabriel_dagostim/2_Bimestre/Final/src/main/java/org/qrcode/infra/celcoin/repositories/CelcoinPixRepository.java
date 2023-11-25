package org.qrcode.infra.celcoin.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.qrcode.domain.dto.QrCodeDTO;
import org.qrcode.domain.repositories.IQrCodeRepository;
import org.qrcode.infra.celcoin.dto.*;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.UUID;

@ApplicationScoped
public class CelcoinPixRepository implements IQrCodeRepository {
    @Inject
    @RestClient
    CelcoinRestClient restClient;

    public QrCodeDTO create(QrCodeDTO dto) {
        CelcoinTokenRequestDTO tokenRequestDTO = new CelcoinTokenRequestDTO();
        CelcoinTokenResponseDTO tokenResponseDTO = this.restClient.getToken(tokenRequestDTO.getClient_id(), tokenRequestDTO.getGrant_type(), tokenRequestDTO.getClient_secret());
        String token = "Bearer ".concat(tokenResponseDTO.getAccess_token());
        CelcoinPixRequestDTO ccPixRequestDTO = this.getCcPixRequestDTO(dto);
        CelcoinPixResponseDTO qrCodeResponseDTO = this.restClient.createStaticPix(token, ccPixRequestDTO);
        dto.setId(UUID.randomUUID().toString());
        dto.setTransactionIdentification(qrCodeResponseDTO.getTransactionIdentification());
        dto.setQrCode(qrCodeResponseDTO.getEmvqrcps());
        return dto;
    }

    private CelcoinPixRequestDTO getCcPixRequestDTO(QrCodeDTO dto) {
        CelcoinMerchantDTO merchantDTO = new CelcoinMerchantDTO();
        CelcoinPixRequestDTO ccPixRequestDTO = new CelcoinPixRequestDTO();
        merchantDTO.setPostalCode(dto.getPostalCode());
        merchantDTO.setCity(dto.getCity());
        merchantDTO.setName(dto.getMerchantName());
        merchantDTO.setMerchantCategoryCode("5651");
        ccPixRequestDTO.setKey(dto.getKey());
        ccPixRequestDTO.setTransactionIdentification("pixqrcodegerado");
        ccPixRequestDTO.setAdditionalInformation(dto.getDescription());
        ccPixRequestDTO.setMerchant(merchantDTO);
        ccPixRequestDTO.setAmount(dto.getAmount());
        return ccPixRequestDTO;
    }
}