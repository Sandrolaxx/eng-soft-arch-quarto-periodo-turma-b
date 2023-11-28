package com.rian.domain.mapper;

import com.rian.domain.dto.PixCelcoinDTO;
import com.rian.domain.entities.PixCelcoinBO;

import java.util.UUID;

// Classe responsável por realizar a conversão entre PixCelcoinBO (entidade de negócio) e PixCelcoinDTO (DTO para transferência de dados)
public class PixCelcoinMapper {

    // Método para converter um PixCelcoinDTO para um PixCelcoinBO
    public static PixCelcoinBO toBO(PixCelcoinDTO dto) {

        return new PixCelcoinBO(
                dto.getId() != null ? UUID.fromString(dto.getId()) : null,
                dto.getKey(),
                dto.getAmount(),
                dto.getQrCode(),
                dto.getTransactionId());
    }

    // Método para converter um PixCelcoinBO para um PixCelcoinDTO
    public static PixCelcoinDTO toDTO(PixCelcoinBO bo) {

        PixCelcoinDTO dto = new PixCelcoinDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());

        return dto;
    }
}

