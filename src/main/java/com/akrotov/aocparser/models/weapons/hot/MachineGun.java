package com.akrotov.aocparser.models.weapons.hot;

/**
 * Created by me on 27.06.17.
 */


public class MachineGun extends HotWeapon {


    public MachineGun(int durability) {

        super(durability);
        minDmg = 7;
        maxDmg = 20;
        amountOfCartridges = 40;
        amountOfShots = 6;

    }

}
