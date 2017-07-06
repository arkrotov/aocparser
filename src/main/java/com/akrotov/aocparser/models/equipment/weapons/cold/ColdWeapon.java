package com.akrotov.aocparser.models.equipment.weapons.cold;

import com.akrotov.aocparser.models.equipment.weapons.Weapon;

import java.util.Random;

/**
 * Created by me on 28.06.17.
 */
public abstract class ColdWeapon implements Weapon {

    protected int minDmg;
    protected int maxDmg;
    protected int durability;
    protected int amountOfShots;
    protected int accuracy;

    private static Random random = new Random();

    public ColdWeapon(int durability) {
        this.durability = durability;
    }

    @Override
    public int attack() {

        int dmg = 0;

        for (int i = 0; i < amountOfShots; i++) {
            dmg = random.nextInt(maxDmg-minDmg) + minDmg;
        }

        return dmg;
    }
}
