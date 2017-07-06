package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */

// TODO: MinDmg / MaxDmg
public class Fist extends ColdWeapon{

    public Fist(int durability) {
        super(durability);
        minDmg = 0;
        maxDmg = 0;
        amountOfShots = 1;
    }
}
