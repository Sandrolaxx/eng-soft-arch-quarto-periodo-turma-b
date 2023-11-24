package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixDBRepository;
import com.fag.domain.usecases.CreateQRCode;
import com.fag.infra.celcoin.repository.CelcoinPix;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
  @Inject
  CelcoinPix celcoin;

  @Inject
  IPixDBRepository panacheRepo;

  @Transactional
  public Response handlePix(PixDTO dto) {
    CreateQRCode createPix = new CreateQRCode(celcoin, panacheRepo);

    PixDTO createdPix = createPix.execute(dto);

    return Response.ok(createdPix).build();
  }

public Response genQRCode(PixDTO dto) {
    return null;
}
}