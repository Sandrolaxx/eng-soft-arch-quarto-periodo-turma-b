package com.fag.pix_api_celcoin.domain.repositories;

import com.fag.pix_api_celcoin.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}
