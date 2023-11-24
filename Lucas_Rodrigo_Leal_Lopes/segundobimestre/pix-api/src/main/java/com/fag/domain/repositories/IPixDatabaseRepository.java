package com.fag.domain.repositories;

import com.fag.domain.entities.CcPixBO;

public interface IPixDatabaseRepository {
    
    CcPixBO persist(CcPixBO dto);

}
