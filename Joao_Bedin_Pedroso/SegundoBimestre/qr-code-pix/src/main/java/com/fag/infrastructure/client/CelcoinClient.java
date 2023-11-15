package com.fag.infrastructure.client;

import com.fag.application.dtos.QRCodeRequest;

public interface CelcoinClient {
    String authenticate();
    String generatePixQRCode(QRCodeRequest request, String token);
}
