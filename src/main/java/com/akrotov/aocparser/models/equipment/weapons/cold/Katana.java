package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class Katana extends ColdWeapon{

    public Katana(int durability) {
        super(durability);
        minDmg = 55;
        maxDmg = 70;
        amountOfShots = 1;
        accuracy = 15;
    }
}
