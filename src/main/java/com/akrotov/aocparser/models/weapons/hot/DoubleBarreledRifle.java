package com.akrotov.aocparser.models.weapons.hot;

public class DoubleBarreledRifle extends HotWeapon {

    public DoubleBarreledRifle(int durability) {
        super(durability);
        minDmg = 13;
        maxDmg = 25;
        amountOfCartridges = 20;
        amountOfShots = 2;
    }

}
