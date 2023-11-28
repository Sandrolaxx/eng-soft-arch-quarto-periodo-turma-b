/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.service;

import com.fag.infra.celcoin.dto.CelOperatorsDTO;
import com.fag.infra.celcoin.dto.CelPixDTO;
import com.fag.infra.celcoin.dto.CelPixResponseDTO;
import com.fag.infra.celcoin.dto.CelProductsDTO;
import com.fag.infra.celcoin.dto.CelRechargeDTO;
import com.fag.infra.celcoin.dto.CelRechargeResponseDTO;
import com.fag.infra.celcoin.dto.CelTokenDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author molin
 */
public class RestClientCel {

    public CelTokenDTO generateToken(Form form) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CelPixResponseDTO handlePix(String token, CelPixDTO pixDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CelRechargeResponseDTO handleRecharge(String token, CelRechargeDTO rechargeDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CelOperatorsDTO listOperators(String token, Integer stateCode, Integer category) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CelProductsDTO listProducts(String token, Integer stateCode, Integer operatorId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @ApplicationScoped
    @RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
    public interface RestClientCelcoin {
        @POST
        @Path("/test/token")
        @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
        CelTokenDTO generateToken(Form form);

        @GET
        @Path("/test/transactions/topups/providers")
        CelOperatorsDTO listOperators(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

        @GET
        @Path("/test/transactions/topups/provider-values")
        CelProductsDTO listProducts(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

        @POST
        @Path("/test/transactions/topups")
        @Consumes(MediaType.APPLICATION_JSON)
        CelRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token, CelRechargeDTO payload);

        @POST
        @Path("/pix/v1/brcode/static")
        @Consumes(MediaType.APPLICATION_JSON)
        CelPixResponseDTO handlePix(@HeaderParam("Authorization") String token, CelPixDTO pix);
    }
}