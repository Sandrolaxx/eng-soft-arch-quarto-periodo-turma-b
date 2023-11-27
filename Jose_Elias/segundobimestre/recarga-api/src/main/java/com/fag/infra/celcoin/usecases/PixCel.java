/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixVendor;
import com.fag.infra.celcoin.dto.CelPixDTO;
import com.fag.infra.celcoin.dto.CelPixResponseDTO;
import com.fag.infra.celcoin.dto.CelTokenDTO;
import com.fag.infra.celcoin.mappers.CelPixMapper;
import com.fag.infra.celcoin.service.RestClientCel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 *
 * @author molin
 */
@ApplicationScoped
public class PixCel implements IPixVendor {
  @Inject
  @RestClient
  RestClientCel clientCel;

  @Override
  public PixDTO create(PixDTO pix) {
    CelPixDTO pixDTO = CelPixMapper.toVendorDTO(pix);

    CelPixResponseDTO pixResponse = clientCel.handlePix(getToken(), pixDTO);

    pix.setQrCode(pixResponse.getQrCode());
    pix.setTransactionId(pixResponse.getTransactionId());

    return pix;
  }

  private String getToken() {
    Form form = new Form();

    form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
    form.param("grant_type", "client_credentials");
    form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

    CelTokenDTO tokenDTO = clientCel.generateToken(form);
    String token = "Bearer " + tokenDTO.getAccessToken();

    return token;
  }
}