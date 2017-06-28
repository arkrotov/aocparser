package com.akrotov.aocparser.models.weapons.cold;

import com.akrotov.aocparser.models.weapons.Weapon;

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
