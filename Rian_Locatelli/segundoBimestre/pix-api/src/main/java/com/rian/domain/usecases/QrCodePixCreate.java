package com.rian.domain.usecases;

import com.rian.domain.dto.PixCelcoinDTO;
import com.rian.domain.entities.PixCelcoinBO;
import com.rian.domain.mapper.PixCelcoinMapper;
import com.rian.domain.repositories.IPixDataBaseRepository;
import com.rian.domain.repositories.IPixVendorRepository;

//Classe responsável por criar um PixCelcoinDTO, persistir um PixCelcoinBO e obter a resposta de um fornecedor.
public class QrCodePixCreate {

    private IPixDataBaseRepository repository;

    private IPixVendorRepository vendor;

    
    public QrCodePixCreate(IPixVendorRepository vendor, IPixDataBaseRepository repository){
        this.vendor = vendor;
        this.repository = repository;

    }

    public PixCelcoinDTO  execute(PixCelcoinDTO  dto){

        PixCelcoinBO  bo = PixCelcoinMapper .toBO(dto);
        PixCelcoinDTO  response = vendor.create(dto);
        repository.persist(bo);
        return response;

    }
}
