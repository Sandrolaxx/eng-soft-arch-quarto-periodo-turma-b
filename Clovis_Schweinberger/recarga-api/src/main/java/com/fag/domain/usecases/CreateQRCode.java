package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDBRepository;
import com.fag.domain.repositories.IPixVendor;

public class CreateQRCode {
    
    private IPixVendor vendor;
    private IPixDBRepository repository;

    public CreateQRCode(IPixVendor vendor, IPixDBRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);
        PixDTO response = vendor.create(dto);
        repository.persist(bo);
        return response;
    }
}
