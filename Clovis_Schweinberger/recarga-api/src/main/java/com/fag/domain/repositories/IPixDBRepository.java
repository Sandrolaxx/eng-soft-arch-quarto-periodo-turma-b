package com.fag.domain.repositories;

import com.fag.domain.entities.PixBO;

public interface IPixDBRepository {
    
    PixBO persist(PixBO PixDTO);
}
