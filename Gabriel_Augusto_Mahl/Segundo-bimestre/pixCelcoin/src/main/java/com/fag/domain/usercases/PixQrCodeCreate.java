package com.fag.domain.usercases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.repositories.IPixVendorRepository;

public class PixQrCodeCreate {
    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public PixQrCodeCreate(IPixVendorRepository vendor, IPixDatabaseRepository repository){

        this.vendor = vendor;
        this.repository = repository;

    }

    public PixDTO execute(PixDTO dto){

        PixBO bo = PixMapper.toBO(dto);
        PixDTO response = vendor.create(dto);
        repository.persist(bo);
        return response;

    }
}
