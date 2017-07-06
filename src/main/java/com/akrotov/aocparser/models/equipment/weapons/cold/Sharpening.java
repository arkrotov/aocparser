package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class Sharpening extends ColdWeapon{

    public Sharpening(int durability) {
        super(durability);
        minDmg = 15;
        maxDmg = 25;
        amountOfShots = 1;
    }
}
