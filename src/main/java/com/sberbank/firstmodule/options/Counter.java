package com.sberbank.firstmodule.options;

import com.sberbank.firstmodule.entities.CityEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Counter {
    public void count(List<CityEntity> list) {
        Map<String, Integer> regionsCount = new HashMap<>();
        for (CityEntity city : list) {
            String region = city.getRegion();
            if (regionsCount.containsKey(region)) {
                regionsCount.replace(region, regionsCount.get(region) + 1);
            } else {
                regionsCount.putIfAbsent(city.getRegion(), 1);
            }
        }
        for (Map.Entry entry : regionsCount.entrySet()) {
            System.out.println(entry);
        }
    }
}
