package main.java.com.fag.domain.repositories;

import main.java.com.fag.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}
