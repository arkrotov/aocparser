package com.akrotov.aocparser.models;

import com.akrotov.aocparser.models.equipment.Armor;
import com.akrotov.aocparser.models.equipment.Jewel;
import com.akrotov.aocparser.models.equipment.League;
import com.akrotov.aocparser.models.equipment.Weapon;
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
    private Ae ae;

    private Person() {
    }

}
