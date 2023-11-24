package br.com.meusite.repository;


import com.seuprojeto.model.PixTransaction;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface PixTransactionRepository extends PanacheRepository<PixTransaction> {
    

    public interface PixTransactionRepository extends PanacheRepository<PixTransaction> {
        PixTransaction findByTransactionId(String transactionId);
    }
    
    public PixTransaction createPixTransaction(PixTransaction transaction) {
        
        String qrCode = generateQrCode(transaction);
        transaction.setQrCode(qrCode);
        pixTransactionRepository.persist(transaction);
        return transaction;
    }
    
}
