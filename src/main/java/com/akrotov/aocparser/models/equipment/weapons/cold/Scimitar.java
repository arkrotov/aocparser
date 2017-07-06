package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class Scimitar extends ColdWeapon {


    public Scimitar(int durability) {
        super(durability);
        minDmg = 18;
        maxDmg = 28;
        amountOfShots = 2;
        accuracy = 10;
    }
}
