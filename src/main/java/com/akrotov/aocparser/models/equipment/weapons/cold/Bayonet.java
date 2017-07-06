package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class Bayonet extends ColdWeapon {

    public Bayonet(int durability) {
        super(durability);
        minDmg = 20;
        maxDmg = 40;
        amountOfShots = 1;
    }
}
