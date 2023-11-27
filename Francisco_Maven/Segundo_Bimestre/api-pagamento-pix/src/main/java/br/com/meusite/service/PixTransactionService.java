package com.seuprojeto.service;

import com.seuprojeto.model.PixTransaction;
import com.seuprojeto.repository.PixTransactionRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PixTransactionService {

    @Inject
    PixTransactionRepository pixTransactionRepository;

    // Método para criar uma nova transação Pix
    @Transactional
    public PixTransaction createPixTransaction(PixTransaction transaction) {
        if (transaction == null) {
            throw new IllegalArgumentException("A transação não pode ser nula.");
        }
        pixTransactionRepository.persist(transaction);
        return transaction;
    }

    // Método para buscar uma transação Pix pelo ID
    public PixTransaction findPixTransactionById(Long id) {
        return pixTransactionRepository.findById(id);
    }

    // Método para listar todas as transações Pix
    public List<PixTransaction> listAllPixTransactions() {
        return pixTransactionRepository.listAll();
    }

    // Método para atualizar uma transação Pix
    @Transactional
    public PixTransaction updatePixTransaction(Long id, PixTransaction transaction) {
        PixTransaction existingTransaction = findPixTransactionById(id);
        if (existingTransaction == null) {
            throw new IllegalArgumentException("Transação com ID " + id + " não encontrada.");
        }
        existingTransaction.setPaymentKey(transaction.getPaymentKey());
        existingTransaction.setAmount(transaction.getAmount());
        existingTransaction.setMerchantInfo(transaction.getMerchantInfo());
        return existingTransaction;
    }

    // Método para excluir uma transação Pix
    @Transactional
    public void deletePixTransaction(Long id) {
        PixTransaction transaction = findPixTransactionById(id);
        if (transaction != null) {
            pixTransactionRepository.delete(transaction);
        }
    }
    
    public String generateQrCode(PixTransaction transaction) {

}

    
}

