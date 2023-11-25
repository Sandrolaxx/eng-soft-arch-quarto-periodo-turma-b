/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixVendor;

/**
 *
 * @author joseem
 */
public class CreatePixQR {

    private IPixVendor pixVendor;

    public CreatePixQR(IPixVendor pixVendor) {
        this.pixVendor = pixVendor;

    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);
        PixDTO response = pixVendor.create(dto);

        return response;
    }
}
