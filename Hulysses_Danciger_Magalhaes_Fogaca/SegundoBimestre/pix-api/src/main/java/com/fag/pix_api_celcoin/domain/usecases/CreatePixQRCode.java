package com.fag.pix_api_celcoin.domain.usecases;

import com.fag.pix_api_celcoin.domain.dto.PixDTO;
import com.fag.pix_api_celcoin.domain.entities.PixBO;
import com.fag.pix_api_celcoin.domain.mappers.PixMapper;
import com.fag.pix_api_celcoin.domain.repositories.IPixDatabaseRepository;
import com.fag.pix_api_celcoin.domain.repositories.IPixVendorRepository;

public class CreatePixQRCode {

    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public CreatePixQRCode(IPixVendorRepository vendor, IPixDatabaseRepository repository) {
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
