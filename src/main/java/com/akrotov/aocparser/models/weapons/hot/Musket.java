package com.akrotov.aocparser.models.weapons.hot;

/**
 * Created by me on 27.06.17.
 */
public class Musket extends HotWeapon {


    public Musket(int durability) {
        super(durability);
        minDmg = 18;
        maxDmg = 30;
        amountOfCartridges = 7;
        amountOfShots = 1;
    }

}
