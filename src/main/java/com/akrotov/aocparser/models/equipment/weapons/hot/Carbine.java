package com.akrotov.aocparser.models.equipment.weapons.hot;

/**
 * Created by me on 27.06.17.
 */
public class Carbine extends HotWeapon {

    public Carbine(int durability) {
        super(durability);
        minDmg = 20;
        maxDmg = 40;
        amountOfCartridges = 8;
        amountOfShots = 1;
    }

}
