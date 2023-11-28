package com.fag.pix_api_celcoin.domain.repositories;

import com.fag.pix_api_celcoin.domain.entities.PixBO;

public interface IPixDatabaseRepository {
    PixBO persist(PixBO pixDTO);
}
