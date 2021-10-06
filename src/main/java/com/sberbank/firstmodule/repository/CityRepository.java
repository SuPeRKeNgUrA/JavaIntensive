package com.sberbank.firstmodule.repository;

import com.sberbank.firstmodule.entities.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<CityEntity, Long> {
    @Override
    List<CityEntity> findAll();
}
