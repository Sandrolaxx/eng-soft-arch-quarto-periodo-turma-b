package com.fag.domain.repositories; //nosso contrato - é onde esta nossas interfaces

import com.fag.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}
