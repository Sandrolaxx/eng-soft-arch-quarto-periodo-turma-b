package com.aktie.domain.usercases;
import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.entities.PixBO;
import com.aktie.domain.mappers.CelCPixMapper;
import com.aktie.domain.repositories.IPixDatabaseRepository;
import com.aktie.domain.repositories.IPixVendorRepository;

public class PixQrCodeCreate {
    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;
    public PixQrCodeCreate(IPixVendorRepository vendor, IPixDatabaseRepository repository){
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixDTO execute(PixDTO dto){
        PixBO bo = CelCPixMapper.toBO(dto);
        PixDTO response = vendor.create(dto);
        repository.persist(bo);
        return response;
    }
}