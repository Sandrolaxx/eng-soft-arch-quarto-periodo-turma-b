package org.acme.domain.usecases;

import org.acme.domain.entities.Merchant;
import org.acme.domain.entities.Pix;

public interface PixService {
    String generateQRCode(Pix pix, Merchant merchant);
}