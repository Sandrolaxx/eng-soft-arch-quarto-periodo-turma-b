package main.java.com.fag.domain.repositories;

import main.java.com.fag.domain.entities.PixBO;

public interface IPixDatabaseRepository {
    PixBO persist(PixBO pixDTO);
}