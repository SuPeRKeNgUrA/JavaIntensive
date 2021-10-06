package com.sberbank.firstmodule.options;

import com.sberbank.firstmodule.entities.CityEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Finder {
    public void findMostPopulatedCity(List<CityEntity> list) {
        int maxPopulation = 0;
        int index = 0;
        CityEntity[] citiesArray = list.toArray(new CityEntity[list.size()]);
        for (int i = 0; i < citiesArray.length; i++) {
            if (citiesArray[i].getPopulation() > maxPopulation) {
                index = i;
                maxPopulation = citiesArray[i].getPopulation();
            }
        }
        System.out.println("[" + index + "]" + " = " + maxPopulation);
    }
}
