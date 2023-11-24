/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.usecases;

/**
 *
 * @author molin
 */
@ApplicationScoped
public class PixCelcoin implements PixVendor {

  @Inject
  @RestClient
  RestClientCelcoin restClientCel;

  @Override
  public PixDTO create(PixDTO pix) {
    CelPixDTO pixDTO = CelPixMapper.toVendorDTO(pix);

    CelPixResponseDTO response = restClientCel.handlePix(getToken(), pixDTO);

    pix.setQrCode(response.getQrCode());
    pix.setTransactionId(response.getTransactionId());

    return pix;
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
