package com.akrotov.aocparser.models.equipment.weapons.hot;

/**
 * Created by me on 27.06.17.
 */
public class Fusee extends HotWeapon{

    public Fusee(int durability) {
        super(durability);
        minDmg = 15;
        maxDmg = 25;
        amountOfCartridges = 6;
        amountOfShots = 1;
    }

}
