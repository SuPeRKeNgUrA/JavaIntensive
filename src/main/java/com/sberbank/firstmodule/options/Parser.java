package com.sberbank.firstmodule.options;

import com.sberbank.firstmodule.entities.CityEntity;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class Parser {

    public List<CityEntity> read() {
        List<CityEntity> listOfCities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/cities.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");

                long id = Long.parseLong(data[0]);
                String name = data[1];
                String region = data[2];
                String district = data[3];
                int population = Integer.parseInt(data[4]);
                int foundation = Integer.parseInt(data[5]);
                CityEntity cityEntity = new CityEntity(id, name, region, district, population, foundation);
                listOfCities.add(cityEntity);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return listOfCities;
    }
}
