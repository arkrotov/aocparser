package com.akrotov.aocparser.models.weapons.hot;

import com.akrotov.aocparser.models.weapons.Weapon;
import lombok.Data;

import java.util.Random;

/**
 * Created by me on 28.06.17.
 */

// TODO: Константы засоряют память

@Data
public abstract class HotWeapon implements Weapon {

    protected int minDmg;
    protected int maxDmg;
    protected int amountOfCartridges;
    protected int durability;
    protected int amountOfShots;
    protected int accuracy;

    private static Random random = new Random();

    public HotWeapon(int durability) {
        this.durability = durability;
    }

    @Override
    public int attack() {

        int dmg = 0;

        for (int i = 0; i < amountOfShots; i++) {
            dmg = amountOfCartridges != 0 ? random.nextInt(maxDmg-minDmg) + minDmg : 0;
        }

        return dmg;
    }
}
