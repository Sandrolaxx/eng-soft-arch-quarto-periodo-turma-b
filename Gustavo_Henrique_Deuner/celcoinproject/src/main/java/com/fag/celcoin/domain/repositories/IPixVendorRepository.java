package com.fag.celcoin.domain.repositories;

import com.fag.celcoin.domain.dto.PixDTO;

public interface IPixVendorRepository {
    PixDTO create(PixDTO pix);
}
