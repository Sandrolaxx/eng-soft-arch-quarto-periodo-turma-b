package java.domain.repositories;

import java.domain.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
  RechargeBO persist(RechargeBO bo);
}