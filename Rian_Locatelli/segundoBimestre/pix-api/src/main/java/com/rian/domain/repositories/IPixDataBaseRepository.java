package com.rian.domain.repositories;

import com.rian.domain.entities.PixCelcoinBO;



//Interface que faz a  persistência de objetos PixCelcoinBO em um banco de dados.

public interface IPixDataBaseRepository {

    PixCelcoinBO persist(PixCelcoinBO dto) throws RuntimeException;
}

