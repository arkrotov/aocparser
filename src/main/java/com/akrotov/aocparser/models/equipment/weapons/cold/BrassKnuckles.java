package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class BrassKnuckles extends ColdWeapon {

    public BrassKnuckles(int durability) {
        super(durability);
        minDmg = 10;
        maxDmg = 20;
        amountOfShots = 1;
    }
}
