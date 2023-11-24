/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fag.domain.repositories;

import com.fag.domain.entities.PixBO;

/**
 *
 * @author joseem
 */
public interface IPixDataRepository {
    PixBO persist(PixBO pixDTO);
}
