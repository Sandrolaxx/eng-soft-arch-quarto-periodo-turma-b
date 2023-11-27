package main.java.com.fag.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import main.java.com.fag.domain.dto.OperatorDTO;
import main.java.com.fag.domain.dto.ProductDTO;
import main.java.com.fag.domain.dto.RechargeDTO;
import main.java.com.fag.domain.repositories.IRechargeVendorRepository;
import main.java.com.fag.domain.usecases.CreateRecharge;
import main.java.com.fag.domain.usecases.ListOperators;
import main.java.com.fag.domain.usecases.ListProducts;
import main.java.com.fag.infra.celcoin.repository.RechargeCelcoin;
import main.java.com.fag.infra.panache.PanacheDataBaseRepository;

@ApplicationScoped
public class RechargeService {
    
    @Inject
    RechargeCelcoin celcoin;
    
    @Inject
    PanacheDataBaseRepository panacheRepo;
    
    public Response listOperators(Integer stateCode, Integer category){
        ListOperators listOperators = new ListOperators((IRechargeVendorRepository) celcoin);

        List<OperatorDTO> operators = listOperators.execute(stateCode, category);
        
        return Response.ok(operators).build();
    }
    
    public Response listProducts(Integer stateCode, Integer operatorID){
        ListProducts listProducts = new ListProducts((IRechargeVendorRepository) celcoin);
        
        List<ProductDTO> operators = listProducts.execute(stateCode, operatorID);
        
        return Response.ok(operators).build();
    }
    
    @Transactional
    public Response handleRecharge(RechargeDTO dto){
        CreateRecharge createRecharge = new CreateRecharge(celcoin, panacheRepo);
        
        RechargeDTO createdRecharge = createRecharge.execute(dto);
        
        return Response.ok(createdRecharge).build();
    }
}