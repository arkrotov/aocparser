package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class Knife extends ColdWeapon {

    public Knife(int durability) {
        super(durability);
        minDmg = 18;
        maxDmg = 30;
        amountOfShots = 1;
    }
}
