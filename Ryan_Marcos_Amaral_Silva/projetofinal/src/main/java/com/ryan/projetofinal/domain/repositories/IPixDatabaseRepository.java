package com.ryan.projetofinal.domain.repositories;

import com.ryan.projetofinal.domain.entities.CoinPixBO;

public interface IPixDatabaseRepository {
    
    CoinPixBO persist(CoinPixBO dto);

}