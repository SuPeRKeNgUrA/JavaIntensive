package com.sberbank.firstmodule;

import com.sberbank.firstmodule.options.*;
import com.sberbank.firstmodule.repository.CityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstModuleApplication implements CommandLineRunner {

    private final Parser parser;
    private final CityRepository cityRepository;
    private final Sorter sorter;
    private final Finder finder;
    private final Counter counter;
    private final Menu menu;

    public FirstModuleApplication(Parser parser, CityRepository cityRepository,
                                  Sorter sorter, Finder finder,
                                  Counter counter, Menu menu) {
        this.parser = parser;
        this.cityRepository = cityRepository;
        this.sorter = sorter;
        this.finder = finder;
        this.counter = counter;
        this.menu = menu;
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstModuleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cityRepository.saveAll(parser.read());
        while (true) {
            int choice = menu.userChoice();
            switch (choice) {
                case 1:
                    cityRepository.findAll().forEach(System.out::println);
                    break;
                case 2:
                    sorter.sortByName(cityRepository.findAll()).forEach(System.out::println);
                    break;
                case 3:
                    sorter.sortByDistrictAndName(cityRepository.findAll()).forEach(System.out::println);
                    break;
                case 4:
                    finder.findMostPopulatedCity(cityRepository.findAll());
                    break;
                case 5:
                    counter.count(cityRepository.findAll());
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}