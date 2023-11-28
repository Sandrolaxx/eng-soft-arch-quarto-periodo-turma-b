package com.fag.infra.celcoin.repository;

import com.fag.domain.dto.PixDTO;

public interface PixVendor {

    PixDTO create(PixDTO pix);
}