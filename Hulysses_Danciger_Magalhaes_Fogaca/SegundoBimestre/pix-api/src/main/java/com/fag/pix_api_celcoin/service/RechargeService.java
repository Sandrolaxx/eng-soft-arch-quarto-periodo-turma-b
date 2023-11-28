package com.fag.pix_api_celcoin.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import com.fag.pix_api_celcoin.domain.dto.OperatorDTO;
import com.fag.pix_api_celcoin.domain.dto.ProductDTO;
import com.fag.pix_api_celcoin.domain.dto.RechargeDTO;
import com.fag.pix_api_celcoin.domain.usecases.CreateRecharge;
import com.fag.pix_api_celcoin.domain.usecases.ListOperators;
import com.fag.pix_api_celcoin.domain.usecases.ListProducts;
import com.fag.pix_api_celcoin.infra.celcoin.repository.RechargeCelcoinRepository;
import com.fag.pix_api_celcoin.infra.panache.repository.PanacheDataBaseRepository;
import java.util.List;

@ApplicationScoped
public class RechargeService {

    @Inject
    RechargeCelcoinRepository celcoin;

    @Inject
    PanacheDataBaseRepository panacheRepo;

    public Response listOperators(Integer stateCode, Integer category) {
        ListOperators listOperators = new ListOperators(celcoin);

        List<OperatorDTO> operators = listOperators.execute(stateCode, category);

        return Response.ok(operators).build();
    }

    public Response listProducts(Integer stateCode, Integer operatorId) {
        ListProducts listServices = new ListProducts(celcoin);

        List<ProductDTO> operators = listServices.execute(stateCode, operatorId);

        return Response.ok(operators).build();
    }

    @Transactional
    public Response handleRecharge(RechargeDTO dto) {
        CreateRecharge createRecharge = new CreateRecharge(celcoin, panacheRepo);

        RechargeDTO createdRecharge = createRecharge.execute(dto);

        return Response.ok(createdRecharge).build();
    }
}