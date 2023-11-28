package com.fag.infra.celcoin.repository;

import com.fag.domain.entities.CCpix;

public interface IPixdbRepository {
    
    CCpix persist(CCpix dto);

}
