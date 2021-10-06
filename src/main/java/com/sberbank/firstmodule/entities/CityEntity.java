package com.sberbank.firstmodule.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CityEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String region;
    private String district;
    private int population;
    private int foundation;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name +
                ", region='" + region +
                "', district='" + district +
                "', population=" + population +
                ", foundation=" + foundation +
                '}';
    }
}



