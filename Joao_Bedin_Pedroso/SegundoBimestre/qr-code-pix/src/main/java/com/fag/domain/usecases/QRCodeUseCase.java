package com.fag.domain.usecases;

import com.fag.application.dtos.QRCodeRequest;
import com.fag.application.dtos.QRCodeResponse;
import com.fag.infrastructure.client.CelcoinClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class QRCodeUseCase {

    private final CelcoinClient celcoinClient;

    @Inject
    public QRCodeUseCase(CelcoinClient celcoinClient) {
        this.celcoinClient = celcoinClient;
    }

    @Transactional
    public QRCodeResponse generateQRCode(QRCodeRequest request) {
        validateRequest(request);

        String token = celcoinClient.authenticate();

        String qrCodeData = celcoinClient.generatePixQRCode(request, token);

        return new QRCodeResponse(qrCodeData);
    }

    private void validateRequest(QRCodeRequest request) {
      
    }
}
