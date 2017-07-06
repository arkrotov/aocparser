package com.akrotov.aocparser.models.equipment.weapons.hot;

/**
 * Created by me on 27.06.17.
 */
public class SniperRifle extends HotWeapon {

    public SniperRifle(int durability) {
        super(durability);
        minDmg = 35;
        maxDmg = 60;
        amountOfCartridges = 15;
        amountOfShots = 1;
        accuracy = 25;
    }
}
