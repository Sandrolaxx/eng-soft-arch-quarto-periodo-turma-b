package com.ryan.projetofinal.domain.repositories;

import com.ryan.projetofinal.domain.dto.CoinPixDTO;

public interface IPixVendorRepository {
    
    CoinPixDTO create(CoinPixDTO dto);

}