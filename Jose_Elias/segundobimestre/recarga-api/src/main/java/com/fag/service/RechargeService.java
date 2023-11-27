/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.service;
import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.usecases.CreateRecharge;
import com.fag.domain.usecases.ListOperators;
import com.fag.domain.usecases.ListProducts;
import com.fag.infra.celcoin.usecases.RechargeCel;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author molin
 */
public class RechargeService {

    @Inject
    RechargeCel rechargeCel;

    public Response listOperators(Integer stateCode, Integer category) {
        ListOperators listOperators = new ListOperators(rechargeCel);

        List<OperatorDTO> operatorDTO = listOperators.execute(stateCode, category);

        return Response.ok(operatorDTO).build();
    }

    public Response listProducts(Integer stateCode, Integer operatorId) {
        ListProducts listServices = new ListProducts(rechargeCel);

        List<ProductDTO> productDTO = listServices.execute(stateCode, operatorId);

        return Response.ok(productDTO).build();
    }

    @Transactional
    public Response handleRecharge(RechargeDTO dto) {
        CreateRecharge createRecharge = new CreateRecharge(rechargeCel);

        RechargeDTO createdRecharge = createRecharge.execute(dto);

        return Response.ok(createdRecharge).build();
    }
}
