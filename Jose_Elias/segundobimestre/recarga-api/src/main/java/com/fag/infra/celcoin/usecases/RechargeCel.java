/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.usecases;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IRechargeVendor;
import com.fag.infra.celcoin.dto.CelOperatorsDTO;
import com.fag.infra.celcoin.dto.CelProductsDTO;
import com.fag.infra.celcoin.dto.CelRechargeDTO;
import com.fag.infra.celcoin.dto.CelRechargeResponseDTO;
import com.fag.infra.celcoin.dto.CelTokenDTO;
import com.fag.infra.celcoin.mappers.CelOperatorMapper;
import com.fag.infra.celcoin.mappers.CelProductMapper;
import com.fag.infra.celcoin.mappers.CelRechargeMapper;
import com.fag.infra.celcoin.service.RestClientCel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 *
 * @author molin
 */
@ApplicationScoped
public class RechargeCel implements IRechargeVendor {

    @Inject
    @RestClient
    RestClientCel restClient;

    @Override
    public RechargeDTO create(RechargeDTO recharge) {

        try {
            CelRechargeDTO rechargeDTO = CelRechargeMapper.toVendorDTO(recharge);

            CelRechargeResponseDTO response = restClient.handleRecharge(getToken(), rechargeDTO);

            recharge.setReceipt(response.getReceipt().getReceiptData());
            recharge.setTransactionId(response.getTransactionId());
            recharge.setSuccess(response.getErrorCode().equals("000"));
        } catch (Exception e) {
            throw new RuntimeException("Erro comunicação com o provedor servico recarga.");
        }

        return recharge;
    }

    @Override
    public List<OperatorDTO> listOperators(Integer stateCode, Integer category) {

        try {
            CelOperatorsDTO operators = restClient.listOperators(getToken(), stateCode, category);

            return operators.getProviders().stream().map(operator -> CelOperatorMapper.toAppDTO(operator)).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Erro referente ao profedor.", e);
        }
    }

    @Override
    public List<ProductDTO> listProducts(Integer operatorId, Integer stateCode) {
        try {
            CelProductsDTO products = restClient.listProducts(getToken(), stateCode, operatorId);

            return products.getProducts().stream().map(product -> CelProductMapper.toAppDTO(product)).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Erro referete ao provedor.");
        }
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

