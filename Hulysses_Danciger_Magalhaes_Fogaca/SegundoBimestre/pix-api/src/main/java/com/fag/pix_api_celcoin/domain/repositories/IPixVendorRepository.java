package com.fag.pix_api_celcoin.domain.repositories;

import com.fag.pix_api_celcoin.domain.dto.PixDTO;

public interface IPixVendorRepository {
    PixDTO create(PixDTO pix);
}
