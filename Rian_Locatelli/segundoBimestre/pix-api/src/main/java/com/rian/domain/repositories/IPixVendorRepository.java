package com.rian.domain.repositories;

import com.rian.domain.dto.PixCelcoinDTO;

//Interface para operações de persistência e recuperação de objetos PixCelcoinDTO.
public interface IPixVendorRepository {

    PixCelcoinDTO  create(PixCelcoinDTO dto);

}
