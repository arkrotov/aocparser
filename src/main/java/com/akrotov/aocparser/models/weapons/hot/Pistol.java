package com.akrotov.aocparser.models.weapons.hot;

/**
 * Created by me on 27.06.17.
 */
public class Pistol extends HotWeapon {

    public Pistol(int durability) {
        super(durability);
        minDmg = 10;
        maxDmg = 20;
        amountOfCartridges = 5;
        amountOfShots = 1;
    }
}
