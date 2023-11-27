package main.java.com.fag.domain.usecases;

import main.java.com.fag.domain.dto.PixDTO;
import main.java.com.fag.domain.entities.PixBO;
import main.java.com.fag.domain.mappers.PixMapper;
import main.java.com.fag.domain.repositories.IPixDatabaseRepository;
import main.java.com.fag.domain.repositories.IPixVendorRepository;

public class CreatePixQR {

    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public CreatePixQR(IPixVendorRepository vendor, IPixDatabaseRepository repository) {
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
