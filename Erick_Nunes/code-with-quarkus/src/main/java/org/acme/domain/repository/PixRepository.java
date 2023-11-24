package org.acme.domain.repository;

import org.acme.domain.entities.Pix;

public interface PixRepository {
    
    Pix save(Pix pix);
    Pix findByTransactionId(String txId);

}