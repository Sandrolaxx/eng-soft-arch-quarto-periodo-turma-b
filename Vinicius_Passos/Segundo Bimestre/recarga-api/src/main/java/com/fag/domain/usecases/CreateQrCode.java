package com.fag.domain.usecases;

import com.fag.domain.mappers.CoinPixMapper;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.repositories.IPixVendedor;
import com.fag.domain.dto.CoinPixDTO;
import com.fag.domain.entities.CoinPixBO;
public class CreateQrCode {
    private IPixVendedor repoPix;
    private IPixDatabaseRepository dataPix;

    public CreateQrCode(IPixVendedor repoPix,IPixDatabaseRepository dataPix){
        this.repoPix = repoPix;
        this.dataPix=dataPix;
    }

    public CoinPixDTO execute(CoinPixDTO dto){
        CoinPixBO bo = CoinPixMapper.toBO(dto);
        CoinPixDTO response=repoPix.create(dto);
        dataPix.persist(bo);
        return response;
    }
}
