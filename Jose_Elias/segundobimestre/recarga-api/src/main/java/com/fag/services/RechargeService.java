/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.services;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.usecases.CreateRecharge;
import com.fag.domain.usecases.ListOperators;
import com.fag.domain.usecases.ListProducts;
import com.fag.infra.celcoin.repository.RechargeCelcoin;
import com.fag.infra.panache.repository.PanacheDataBaseRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author joseem
 */
@ApplicationScoped
public class RechargeService {

    @Inject
    RechargeCelcoin rechargeCelcoin;

    @Inject
    PanacheDataBaseRepository dataRepo;

    public Response listOperators(Integer stateCode, Integer category) {
        ListOperators listOperators = new ListOperators(rechargeCelcoin);

        List<OperatorDTO> operatorDTO = listOperators.execute(stateCode, category);

        return Response.ok(operatorDTO).build();
    }

    public Response listProducts(Integer stateCode, Integer operatorId) {
        ListProducts listServices = new ListProducts(rechargeCelcoin);

        List<ProductDTO> operatorDTO = listServices.execute(stateCode, operatorId);

        return Response.ok(operatorDTO).build();
    }

    @Transactional
    public Response handleRecharge(RechargeDTO dto) {
        CreateRecharge createRecharge = new CreateRecharge(rechargeCelcoin, dataRepo);

        RechargeDTO rechargeDTO = createRecharge.execute(dto);

        return Response.ok(rechargeDTO).build();
    }
}
