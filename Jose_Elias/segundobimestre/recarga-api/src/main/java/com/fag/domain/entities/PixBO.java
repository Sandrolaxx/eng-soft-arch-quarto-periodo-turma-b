/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author joseem
 */
public class PixBO {
    private UUID id;
    private BigDecimal amount;
    private String email;
    private String description;
    private String emv;
    private String base64;
    private LocalDateTime expiration;
    
    
}
