package com.rian.domain.repositories;

import com.rian.domain.dto.PixDTO;

 //Interface para operações de persistência e recuperação de objetos PixDTO.

public interface IPixRepository {
    
    PixDTO create(PixDTO dto);
}
