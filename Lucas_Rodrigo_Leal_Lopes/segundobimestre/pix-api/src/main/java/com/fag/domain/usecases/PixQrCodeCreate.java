package com.fag.domain.usecases;

import com.fag.domain.dto.CcPixDTO;
import com.fag.domain.entities.CcPixBO;
import com.fag.domain.mappers.CcPixMapper;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.repositories.IPixVendorRepository;

public class PixQrCodeCreate {
    
    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public PixQrCodeCreate(IPixVendorRepository vendor, IPixDatabaseRepository repository){
        
        this.vendor = vendor;
        this.repository = repository;
        
    }

    public CcPixDTO execute(CcPixDTO dto){
        
        CcPixBO bo = CcPixMapper.toBO(dto);
        CcPixDTO response = vendor.create(dto);
        repository.persist(bo);
        return response;

    }
}
