package com.aktie.domain.repositories;

import com.aktie.domain.entities.PixBO;

public interface IPixDatabaseRepository {
    PixBO persist(PixBO dto);

}
