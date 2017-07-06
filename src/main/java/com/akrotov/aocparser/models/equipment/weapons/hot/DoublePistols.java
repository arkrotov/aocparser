package com.akrotov.aocparser.models.equipment.weapons.hot;

/**
 * Created by me on 27.06.17.
 */
public class DoublePistols extends HotWeapon {

    public DoublePistols(int durability) {
            super(durability);
            minDmg = 22;
            maxDmg = 45;
            amountOfCartridges = 10;
            amountOfShots = 1;
    }

}
