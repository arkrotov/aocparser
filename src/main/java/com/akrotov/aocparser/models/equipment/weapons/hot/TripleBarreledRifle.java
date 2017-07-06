package com.akrotov.aocparser.models.equipment.weapons.hot;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

/**
 * Created by me on 27.06.17.
 */
public class TripleBarreledRifle extends HotWeapon{

    public TripleBarreledRifle(int durability) {
        super(durability);
        minDmg = 14;
        maxDmg = 22;
        amountOfCartridges = 30;
        amountOfShots = 3;
        accuracy = 7;
    }
}
