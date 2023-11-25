package main.domain.usecases;

import main.domain.dto.RechargeDTO;
import main.domain.entities.RechargeBO;
import main.domain.mappers.RechargeMapper;
import main.domain.repositories.IRechargeDataBaseRepository;
import main.domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
    private final IRechargeVendorRepository vendor;
    private final IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO rechargeDTO) {
        // Realize a lógica de criação da recarga usando o vendor
        RechargeDTO createdRecharge = vendor.create(rechargeDTO);

        // Salve a recarga no banco de dados
        RechargeBO rechargeBO = RechargeMapper.toBO(createdRecharge);
        RechargeBO persistedRechargeBO = dbRepository.persist(rechargeBO);

        // Retorne a recarga criada
        return RechargeMapper.toDTO(persistedRechargeBO);
    }
}