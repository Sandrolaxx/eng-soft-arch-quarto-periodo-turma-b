package com.aktie.domain.repositories;

import com.aktie.domain.dto.CPixDTO;

public interface IVendorRepository {

    CPixDTO create(CPixDTO dto);
    
}