package com.akrotov.aocparser.models;

import com.akrotov.aocparser.models.enums.Armor;
import com.akrotov.aocparser.models.enums.Jewel;
import com.akrotov.aocparser.models.enums.League;
import com.akrotov.aocparser.models.enums.Weapon;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Person {

    private Weapon coldWeapon;
    private Weapon hotWeapon;
    private Armor armor;
    private List<Jewel> jewels;
    private Integer initiative;
    private League league;
    private String owner;

    private Person() {
    }

}
