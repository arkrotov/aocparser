package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class Saber extends ColdWeapon {

    public Saber(int durability) {
        super(durability);
        minDmg = 22;
        maxDmg = 45;
        amountOfShots = 1;
    }

}
