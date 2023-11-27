package com.fag.domain.repositories;

import com.fag.domain.entities.CoinPixBO;

public interface IPixDatabaseRepository {
        CoinPixBO persist(CoinPixBO dto);
    
}
