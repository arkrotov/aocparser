package com.akrotov.aocparser.models.weapons.cold;

import com.akrotov.aocparser.models.weapons.Weapon;

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
