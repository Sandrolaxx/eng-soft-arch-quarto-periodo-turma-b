package main.domain.repositories;

import main.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}
