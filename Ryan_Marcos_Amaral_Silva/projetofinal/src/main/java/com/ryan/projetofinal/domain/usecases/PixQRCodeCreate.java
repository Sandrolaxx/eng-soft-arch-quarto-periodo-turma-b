package com.ryan.projetofinal.domain.usecases;

import com.ryan.projetofinal.domain.dto.CoinPixDTO;
import com.ryan.projetofinal.domain.entities.CoinPixBO;
import com.ryan.projetofinal.domain.mappers.CoinPixMapper;
import com.ryan.projetofinal.domain.repositories.IPixDatabaseRepository;
import com.ryan.projetofinal.domain.repositories.IPixVendorRepository;

public class PixQRCodeCreate {
    
    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public PixQRCodeCreate(IPixVendorRepository vendor, IPixDatabaseRepository repository){
        
        this.vendor = vendor;
        this.repository = repository;
        
    }

    public CoinPixDTO execute(CoinPixDTO dto){
        
        CoinPixBO bo = CoinPixMapper.toBO(dto);
        CoinPixDTO response = vendor.create(dto);
        repository.persist(bo);
        return response;

    }
}
