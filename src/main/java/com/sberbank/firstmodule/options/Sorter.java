package com.sberbank.firstmodule.options;

import com.sberbank.firstmodule.entities.CityEntity;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Sorter {
    public List<CityEntity> sortByName(List<CityEntity> list) {
        return list.stream().sorted(Comparator.comparing(CityEntity::getName))
                .collect(Collectors.toList());
    }

    public List<CityEntity> sortByDistrictAndName(List<CityEntity> list) {
        return list.stream().sorted(Comparator.comparing(CityEntity::getDistrict)
                        .thenComparing(CityEntity::getName)).collect(Collectors.toList());
    }
}
