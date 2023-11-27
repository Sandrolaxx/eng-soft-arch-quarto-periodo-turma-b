package com.fag.domain.repositories;

import com.fag.domain.entities.PixBO;

public interface IPixDatabaseRepository {
    PixBO persist(PixBO pixDTO);
}
