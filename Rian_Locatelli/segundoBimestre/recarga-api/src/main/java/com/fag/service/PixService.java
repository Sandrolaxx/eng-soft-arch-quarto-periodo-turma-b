package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.domain.usecases.PixCreate;
import com.fag.infra.celcoin.usecases.CelcoinPix;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
  @Inject
  CelcoinPix celcoin;

  @Inject
  IPixDataBaseRepository panacheRepository;

  @Transactional
  public Response handlePix(PixDTO dto) {
    PixCreate pixCreate = new PixCreate(celcoin, panacheRepository);

    PixDTO createdPix = pixCreate.execute(dto);

    return Response.ok(createdPix).build();
  }
}
